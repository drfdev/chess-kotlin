package dev.drf.classic

import dev.drf.core.ChessRules
import dev.drf.core.Chessboard
import dev.drf.core.data.CanMove
import dev.drf.core.data.Move

class ClassicChessRules : ChessRules {
    override fun checkDestination(
            move: Move,
            map: Chessboard
    ): CanMove {
        // TODO
        return CanMove()
    }
}