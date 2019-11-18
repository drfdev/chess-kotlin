package dev.drf.core

interface ChessFigure {
    fun type(): ChessType
    fun rules(): List<MoveRule>
}