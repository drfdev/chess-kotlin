package dev.drf.output

import dev.drf.core.Chessboard
import dev.drf.util.stringToCell

class ConsoleOutput {
    fun draw(map: Chessboard) {
        println("""
            8_| |${getChar(map, "A8")}_|${getChar(map, "B8")}_|${getChar(map, "C8")}_|${getChar(map, "D8")}_|${getChar(map, "E8")}_|${getChar(map, "F8")}_|${getChar(map, "G8")}_|${getChar(map, "H8")}_|
            7_| |${getChar(map, "A7")}_|${getChar(map, "B7")}_|${getChar(map, "C7")}_|${getChar(map, "D7")}_|${getChar(map, "E7")}_|${getChar(map, "F7")}_|${getChar(map, "G7")}_|${getChar(map, "H7")}_|
            6_| |${getChar(map, "A6")}_|${getChar(map, "B6")}_|${getChar(map, "C6")}_|${getChar(map, "D6")}_|${getChar(map, "E6")}_|${getChar(map, "F6")}_|${getChar(map, "G6")}_|${getChar(map, "H6")}_|
            5_| |${getChar(map, "A5")}_|${getChar(map, "B5")}_|${getChar(map, "C5")}_|${getChar(map, "D5")}_|${getChar(map, "E5")}_|${getChar(map, "F5")}_|${getChar(map, "G5")}_|${getChar(map, "H5")}_|
            4_| |${getChar(map, "A4")}_|${getChar(map, "B4")}_|${getChar(map, "C4")}_|${getChar(map, "D4")}_|${getChar(map, "E4")}_|${getChar(map, "F4")}_|${getChar(map, "G4")}_|${getChar(map, "H4")}_|
            3_| |${getChar(map, "A3")}_|${getChar(map, "B3")}_|${getChar(map, "C3")}_|${getChar(map, "D3")}_|${getChar(map, "E3")}_|${getChar(map, "F3")}_|${getChar(map, "G3")}_|${getChar(map, "H3")}_|
            2_| |${getChar(map, "A2")}_|${getChar(map, "B2")}_|${getChar(map, "C2")}_|${getChar(map, "D2")}_|${getChar(map, "E2")}_|${getChar(map, "F2")}_|${getChar(map, "G2")}_|${getChar(map, "H2")}_|
            1_| |${getChar(map, "A1")}_|${getChar(map, "B1")}_|${getChar(map, "C1")}_|${getChar(map, "D1")}_|${getChar(map, "E1")}_|${getChar(map, "F1")}_|${getChar(map, "G1")}_|${getChar(map, "H1")}_|
             _| | __ __ __ __ __ __ __ __
            //| |A_|B_|C_|D_|E_|F_|G_|H_|
        """.trimIndent())
    }

    private fun getChar(map: Chessboard, cell: String): Char {
        return map.cellChar(stringToCell(cell))
    }
}