package dev.drf.config

import dev.drf.classic.ClassicChessRules
import dev.drf.classic.ClassicChessboard
import dev.drf.core.ChessRules
import dev.drf.core.Chessboard

class ChessConfig {
    fun chessboard(): Chessboard {
        return ClassicChessboard()
    }
    fun rules(): ChessRules {
        return ClassicChessRules()
    }
}