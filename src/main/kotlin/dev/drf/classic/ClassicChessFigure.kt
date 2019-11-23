package dev.drf.classic

import dev.drf.core.ChessFigure
import dev.drf.core.ChessType
import dev.drf.core.MoveRule

class ClassicChessFigure(
        private val type: ChessType
) : ChessFigure {
    private var rules: List<MoveRule> = emptyList()

    override fun type(): ChessType {
        return type
    }

    override fun rules(): List<MoveRule> {
        return rules
    }

    fun initializeRules(rules: List<MoveRule>) {
        this.rules = rules
    }
}