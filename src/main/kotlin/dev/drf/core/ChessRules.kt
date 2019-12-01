package dev.drf.core

import dev.drf.core.data.ChessboardCell

interface ChessRules {
    fun checkDestination(
            startPosition: ChessboardCell,
            endPosition: ChessboardCell,
            type: ChessType,
            map: Chessboard
    ): Boolean
}