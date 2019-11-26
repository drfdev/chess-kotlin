package dev.drf

import dev.drf.config.ChessConfig
import dev.drf.game.ChessGame
import dev.drf.output.ConsoleOutput

fun main(args: Array<String>) {
    println("Kotlin chess")

    val config = ChessConfig()
    val output = ConsoleOutput()

    val game = ChessGame(config, output)

    game.start()
    game.stepByStep()
}