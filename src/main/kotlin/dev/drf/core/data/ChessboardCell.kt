package dev.drf.core.data

fun chessboardCellOf(row: Int, cell: Int): ChessboardCell = ChessboardCell(row, cell)
data class ChessboardCell(val row: Int, val cell: Int)