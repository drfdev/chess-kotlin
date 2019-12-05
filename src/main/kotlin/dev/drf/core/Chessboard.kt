package dev.drf.core

import dev.drf.config.ChessConfig
import dev.drf.core.common.Resatable
import dev.drf.core.data.ChessboardCell

interface Chessboard : Resatable {
    fun figures(): MutableList<ChessFigure> {
        val figures = mutableListOf<ChessFigure>()
        figures.addAll(whiteFigures())
        figures.addAll(blackFigures())
        return figures
    }
    fun whiteFigures(): List<ChessFigure>
    fun blackFigures(): List<ChessFigure>
    fun initFigures(config: ChessConfig)
    fun cellChar(cell: ChessboardCell): Char
    fun cellFigure(cell: ChessboardCell): ChessFigure?
}