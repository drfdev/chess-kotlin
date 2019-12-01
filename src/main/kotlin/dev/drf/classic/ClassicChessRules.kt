package dev.drf.classic

import dev.drf.core.ChessRules
import dev.drf.core.ChessType
import dev.drf.core.data.CheckerboardCell

class ClassicChessRules : ChessRules {
    override fun checkMove(
            startPosition: CheckerboardCell,
            endPosition: CheckerboardCell,
            type: ChessType
    ): Boolean {
        return false
    }
}