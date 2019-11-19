package dev.drf.classic

import dev.drf.core.Checkerboard
import dev.drf.core.ChessFigure

class ClassicCheckerboard : Checkerboard {
    val figures = mutableListOf<ChessFigure>()

    override fun whiteFigures(): List<ChessFigure> {
        return figures.filter { it -> it.type().white }
    }

    override fun blackFigures(): List<ChessFigure> {
        return figures.filter { it -> !it.type().white }
    }
}