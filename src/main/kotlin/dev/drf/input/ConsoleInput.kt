package dev.drf.input

import java.util.*

class ConsoleInput {
    private val scan: Scanner = Scanner(System.`in`)

    fun readString(): String {
        return scan.nextLine();
    }
}