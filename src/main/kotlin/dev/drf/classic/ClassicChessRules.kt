package dev.drf.classic

import dev.drf.core.ChessRules
import dev.drf.core.ChessType
import dev.drf.core.Chessboard
import dev.drf.core.data.ChessboardCell

class ClassicChessRules : ChessRules {
    override fun checkDestination(
            startPosition: ChessboardCell,
            endPosition: ChessboardCell,
            type: ChessType,
            map: Chessboard
    ): Boolean {
        // TODO
        return false
    }
}