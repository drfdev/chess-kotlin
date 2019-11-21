package dev.drf

import dev.drf.config.ChessConfig
import dev.drf.game.ChessGame

fun main(args: Array<String>) {
    println("Kotlin chess")

    val config = ChessConfig();
    val game = ChessGame(config);

}