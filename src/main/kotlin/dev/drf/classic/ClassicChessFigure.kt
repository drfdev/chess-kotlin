package dev.drf.classic

import dev.drf.core.ChessFigure
import dev.drf.core.ChessType
import dev.drf.core.data.ChessboardCell

class ClassicChessFigure(
        private val type: ChessType,
        private var cell: ChessboardCell
) : ChessFigure {
    override fun type(): ChessType {
        return type
    }

    override fun cell(): ChessboardCell {
        return cell
    }
}