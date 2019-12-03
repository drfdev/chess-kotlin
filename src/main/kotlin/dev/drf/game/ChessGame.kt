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

    fun start() {
        reset()
        nextStep()
    }
    fun nextMove() {
        // TODO
    }
    private fun nextStep() {
        drawBoard()
        // TODO
        /*
        wait command
        command
        analyze command
        check move
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