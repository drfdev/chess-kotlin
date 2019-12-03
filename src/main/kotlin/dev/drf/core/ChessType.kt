package dev.drf.core

enum class ChessType(val char: Char, val white: Boolean) {
    /* White */
    WHITE_KING('♚', true),
    WHITE_QUEEN('♛', true),
    WHITE_ROOK('♜', true),
    WHITE_BISHOP('♝', true),
    WHITE_KNIGHT('♞', true),
    WHITE_PAWN('♟', true),
    /* Black */
    BLANK_KING('♔', false),
    BLANK_QUEEN('♕', false),
    BLANK_ROOK('♖', false),
    BLANK_BISHOP('♗', false),
    BLANK_KNIGHT('♘', false),
    BLANK_PAWN('♙', false)
}