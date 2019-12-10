package dev.drf.core

import dev.drf.core.data.CanMove
import dev.drf.core.data.Move
import dev.drf.game.Turn

interface ChessRules {
    fun checkDestination(
            move: Move,
            map: Chessboard,
            turn: Turn
    ): CanMove
}