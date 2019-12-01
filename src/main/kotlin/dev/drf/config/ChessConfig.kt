package dev.drf.config

import dev.drf.classic.ClassicChessFigure
import dev.drf.classic.ClassicChessRules
import dev.drf.classic.ClassicChessboard
import dev.drf.core.ChessFigure
import dev.drf.core.ChessRules
import dev.drf.core.ChessType
import dev.drf.core.Chessboard
import dev.drf.core.data.ChessboardCell
import dev.drf.core.data.chessboardCellOf
import org.w3c.dom.CharacterData
import java.lang.RuntimeException

class ChessConfig {
    fun chessboard(): Chessboard {
        return ClassicChessboard()
    }
    fun rules(): ChessRules {
        return ClassicChessRules()
    }
    fun defaultWhiteFigures(): List<ChessFigure> {
        return listOf(
                /* row 1 */
                ClassicChessFigure(ChessType.WHITE_PAWN, stringToCell("A2")),
                ClassicChessFigure(ChessType.WHITE_PAWN, stringToCell("B2")),
                ClassicChessFigure(ChessType.WHITE_PAWN, stringToCell("C2")),
                ClassicChessFigure(ChessType.WHITE_PAWN, stringToCell("D2")),
                ClassicChessFigure(ChessType.WHITE_PAWN, stringToCell("E2")),
                ClassicChessFigure(ChessType.WHITE_PAWN, stringToCell("F2")),
                ClassicChessFigure(ChessType.WHITE_PAWN, stringToCell("G2")),
                ClassicChessFigure(ChessType.WHITE_PAWN, stringToCell("H2")),
                /* row 2 */
                ClassicChessFigure(ChessType.WHITE_ROOK, stringToCell("A1")),
                ClassicChessFigure(ChessType.WHITE_KNIGHT, stringToCell("B1")),
                ClassicChessFigure(ChessType.WHITE_BISHOP, stringToCell("C1")),
                ClassicChessFigure(ChessType.WHITE_QUEEN, stringToCell("D1")),
                ClassicChessFigure(ChessType.WHITE_KING, stringToCell("E1")),
                ClassicChessFigure(ChessType.WHITE_BISHOP, stringToCell("F1")),
                ClassicChessFigure(ChessType.WHITE_KNIGHT, stringToCell("G1")),
                ClassicChessFigure(ChessType.WHITE_ROOK, stringToCell("H1"))
        )
    }
    fun defaultBlackFigures(): List<ChessFigure> {
        return listOf(
                /* row 1 */
                ClassicChessFigure(ChessType.BLANK_ROOK, stringToCell("A8")),
                ClassicChessFigure(ChessType.BLANK_KNIGHT, stringToCell("B8")),
                ClassicChessFigure(ChessType.BLANK_BISHOP, stringToCell("C8")),
                ClassicChessFigure(ChessType.BLANK_QUEEN, stringToCell("D8")),
                ClassicChessFigure(ChessType.BLANK_KING, stringToCell("E8")),
                ClassicChessFigure(ChessType.BLANK_BISHOP, stringToCell("F8")),
                ClassicChessFigure(ChessType.BLANK_KNIGHT, stringToCell("G8")),
                ClassicChessFigure(ChessType.BLANK_ROOK, stringToCell("H8")),
                /* row 2 */
                ClassicChessFigure(ChessType.BLANK_PAWN, stringToCell("A7")),
                ClassicChessFigure(ChessType.BLANK_PAWN, stringToCell("B7")),
                ClassicChessFigure(ChessType.BLANK_PAWN, stringToCell("C7")),
                ClassicChessFigure(ChessType.BLANK_PAWN, stringToCell("D7")),
                ClassicChessFigure(ChessType.BLANK_PAWN, stringToCell("E7")),
                ClassicChessFigure(ChessType.BLANK_PAWN, stringToCell("F7")),
                ClassicChessFigure(ChessType.BLANK_PAWN, stringToCell("G7")),
                ClassicChessFigure(ChessType.BLANK_PAWN, stringToCell("H7"))
        )
    }
    private fun stringToCell(value: String): ChessboardCell {
        val row = value[0]
        val cell = value[1]

        return chessboardCellOf(Character.getNumericValue(row) - 1, charToInt(cell))
    }
    private fun charToInt(ch: Char): Int {
        return when(ch) {
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
}