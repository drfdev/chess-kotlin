package dev.drf.classic

import dev.drf.core.ChessRules
import dev.drf.core.ChessType
import dev.drf.core.Chessboard
import dev.drf.core.data.ChessboardCell
import dev.drf.core.data.Move

class ClassicChessRules : ChessRules {
    override fun checkDestination(
            move: Move,
            type: ChessType,
            map: Chessboard
    ): Boolean {
        // TODO
        return false
    }
}