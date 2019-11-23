package dev.drf.core.data

fun checkerboardCellOf(row: Int, cell: Int): CheckerboardCell = CheckerboardCell(row, cell)
data class CheckerboardCell(val row: Int, val cell: Int)