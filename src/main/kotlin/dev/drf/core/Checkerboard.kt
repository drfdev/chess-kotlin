package dev.drf.core

interface Checkerboard {
    fun figures(): MutableList<ChessFigure> {
        val figures = mutableListOf<ChessFigure>()
        figures.addAll(whiteFigures())
        figures.addAll(blackFigures())
        return figures
    }
    fun whiteFigures(): List<ChessFigure>
    fun blackFigures(): List<ChessFigure>
}