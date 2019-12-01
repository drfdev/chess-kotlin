package dev.drf.core

import dev.drf.core.data.CheckerboardCell

interface ChessRules {
    fun checkMove(
            startPosition: CheckerboardCell,
            endPosition: CheckerboardCell,
            type: ChessType
    ): Boolean
}