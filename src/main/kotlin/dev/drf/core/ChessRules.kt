package dev.drf.core

import dev.drf.core.data.ChessboardCell
import dev.drf.core.data.Move

interface ChessRules {
    fun checkDestination(
            move: Move,
            type: ChessType,
            map: Chessboard
    ): Boolean
}