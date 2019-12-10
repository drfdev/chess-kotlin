package dev.drf.game

import dev.drf.config.ChessConfig
import dev.drf.core.ChessRules
import dev.drf.core.Chessboard
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

    fun start() {
        reset()
        while (isGameNotFinished()) {
            nextStep()
            switchTurn()
        }
        endGame()
    }

    private fun nextMove() {
        // TODO
    }

    private fun nextStep() {
        drawBoard()
        val command = input.readString()
        val move = commandChain.execute(command)
        val canMove = rules.checkDestination(move, board, turn)
        // TODO
        /*
        error or make move
        is game over?
        yes - stop
        no - nextStep
         */
    }

    private fun drawBoard() {
        output.draw(board)
        output.draw(turn)
    }

    private fun reset() {
        board.reset()
        board.initFigures(config)
    }

    private fun isGameNotFinished(): Boolean {
        // TODO
        return true
    }

    private fun endGame() {
        // TODO
    }

    private fun switchTurn() {
        turn = if (turn == Turn.WHITE) Turn.BLACK else Turn.WHITE
    }
}