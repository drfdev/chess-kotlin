package dev.drf.config

import dev.drf.classic.ClassicCheckerboard
import dev.drf.core.Checkerboard

class ChessConfig {
    fun checkerboard(): Checkerboard {
        return ClassicCheckerboard()
    }
}