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
        board.initFigures(config)
        // TODO
    }
    fun nextMove() {
        // TODO
    }
    fun stepByStep() {
        // TODO
    }

    private fun drawBoard() {
        output.draw(board)
    }

    private fun reset() {
        board.reset()
    }
}