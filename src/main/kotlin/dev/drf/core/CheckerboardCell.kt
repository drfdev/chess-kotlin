package dev.drf.core

data class CheckerboardCell(val row: Int, val cell: Int) {
    companion object Factory {
        fun of(row: Int, cell: Int): CheckerboardCell = CheckerboardCell(row, cell)
    }
}