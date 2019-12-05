package dev.drf.core

import dev.drf.core.data.CanMove
import dev.drf.core.data.Move

interface ChessRules {
    fun checkDestination(
            move: Move,
            map: Chessboard
    ): CanMove
}