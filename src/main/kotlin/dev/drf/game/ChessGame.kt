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

    fun start() {
        reset()
        nextStep()
    }

    fun nextMove() {
        // TODO
    }

    private fun nextStep() {
        drawBoard()
        val command = input.readString()
        val move = commandChain.execute(command)
        val canMove = rules.checkDestination(move, board)
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
    }

    private fun reset() {
        board.reset()
        board.initFigures(config)
    }
}