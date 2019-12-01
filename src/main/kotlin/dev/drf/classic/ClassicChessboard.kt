package dev.drf.classic

import dev.drf.core.Chessboard
import dev.drf.core.ChessFigure

class ClassicChessboard : Chessboard {
    private val figures = mutableListOf<ChessFigure>()

    override fun whiteFigures(): List<ChessFigure> {
        return figures.filter { it.type().white }
    }

    override fun blackFigures(): List<ChessFigure> {
        return figures.filter { !it.type().white }
    }
}