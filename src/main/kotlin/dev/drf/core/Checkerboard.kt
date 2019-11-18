package dev.drf.core

interface Checkerboard {
    fun figures(): MutableList<ChessFigure> {
        val figures = mutableListOf<ChessFigure>()
        figures.addAll(whiteFigures())
        figures.addAll(blackFigures())
        return figures
    }
    fun whiteFigures(): MutableList<ChessFigure>
    fun blackFigures(): MutableList<ChessFigure>
}