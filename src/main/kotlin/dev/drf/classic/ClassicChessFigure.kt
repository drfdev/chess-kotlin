package dev.drf.classic

import dev.drf.core.ChessFigure
import dev.drf.core.ChessType

class ClassicChessFigure(
        private val type: ChessType
) : ChessFigure {
    override fun type(): ChessType {
        return type
    }
}