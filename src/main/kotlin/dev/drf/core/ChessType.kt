package dev.drf.core

enum class ChessType(val char: Char) {
    /* White */
    WHITE_KING('♔'),
    WHITE_QUEEN('♕'),
    WHITE_ROOK('♖'),
    WHITE_BISHOP('♗'),
    WHITE_KNIGHT('♘'),
    WHITE_PAWN('♙'),
    /* Black */
    BLANK_KING('♚'),
    BLANK_QUEEN('♛'),
    BLANK_ROOK('♜'),
    BLANK_BISHOP('♝'),
    BLANK_KNIGHT('♞'),
    BLANK_PAWN('♟')
}