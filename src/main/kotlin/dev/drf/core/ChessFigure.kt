package dev.drf.core

import dev.drf.core.data.ChessboardCell

interface ChessFigure {
    fun type(): ChessType
    fun cell(): ChessboardCell
}