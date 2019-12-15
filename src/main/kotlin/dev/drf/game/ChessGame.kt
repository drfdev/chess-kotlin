package dev.drf.game

import dev.drf.config.ChessConfig
import dev.drf.core.ChessRules
import dev.drf.core.Chessboard
import dev.drf.core.data.ContextType
import dev.drf.input.CommandContext
import dev.drf.input.ConsoleInput
import dev.drf.output.ConsoleOutput

class ChessGame(
        val config: ChessConfig,
        val output: ConsoleOutput,
        val input: ConsoleInput
) {
    var board: Chessboard = config.chessboard()
    var rules: ChessRules = config.rules()
    var commandChain = config.defaultCommandDetectorChain()
    var turn = config.defaultTurn()
    var gameFinished = false

    fun start() {
        reset()
        while (isGameNotFinished()) {
            var status = nextStep()
            if (status == StepStatus.EXIT) {
                gameFinished = true
                break
            }
            while (status == StepStatus.ERROR) {
                status = errorStep()
                if (status == StepStatus.EXIT) {
                    gameFinished = true
                    break
                }
            }
            switchTurn()
        }
        endGame()
    }

    private fun nextStep(): StepStatus {
        output.draw(board)
        output.draw(turn)
        return awaitAndExecuteChessCommand()
    }

    private fun errorStep(): StepStatus {
        output.draw(turn)
        return awaitAndExecuteChessCommand()
    }

    private fun awaitAndExecuteChessCommand(): StepStatus {
        val command = input.readString()
        val moveContext = commandChain.execute(CommandContext(command))
        if (moveContext.contextType == ContextType.EXIT) {
            return StepStatus.EXIT
        }
        val canMove = rules.checkDestination(moveContext.move, board, turn)
        // TODO
        /*
        is King under attack ?
        yes -
            King can escape ?
                yes - warning
                no - game ended
        no - just move
         */
        return StepStatus.SUCCESS
    }

    private fun reset() {
        board.reset()
        board.initFigures(config)
    }

    private fun isGameNotFinished(): Boolean {
        return !gameFinished
    }

    private fun endGame() {
        // TODO
    }

    private fun switchTurn() {
        turn = if (turn == Turn.WHITE) Turn.BLACK else Turn.WHITE
    }
}