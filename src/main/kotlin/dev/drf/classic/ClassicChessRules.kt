package dev.drf.classic

import dev.drf.core.ChessRules
import dev.drf.core.Chessboard
import dev.drf.core.data.CanMove
import dev.drf.core.data.Move
import dev.drf.game.Turn

class ClassicChessRules : ChessRules {
    override fun checkDestination(
            move: Move,
            map: Chessboard,
            turn: Turn
    ): CanMove {
        // TODO
        return CanMove()
    }
}