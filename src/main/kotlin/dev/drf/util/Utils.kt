package dev.drf.util

import dev.drf.core.data.ChessboardCell
import dev.drf.core.data.chessboardCellOf

fun stringToCell(value: String): ChessboardCell {
    val cell = value[0]
    val row = value[1]

    return chessboardCellOf(Character.getNumericValue(row) - 1, charToInt(cell))
}

private fun charToInt(ch: Char): Int {
    return when (ch) {
        'A' -> 0
        'B' -> 1
        'C' -> 2
        'D' -> 3
        'E' -> 4
        'F' -> 5
        'G' -> 6
        'H' -> 7
        else -> throw RuntimeException("Wrong cell letter")
    }
}