package dev.drf

import dev.drf.classic.ClassicChessRules
import dev.drf.config.ChessConfig
import dev.drf.core.ChessRules
import dev.drf.game.ChessGame
import dev.drf.input.ConsoleInput
import dev.drf.output.ConsoleOutput

fun main(args: Array<String>) {
    println("Kotlin chess")

    val config = ChessConfig()
    val output = ConsoleOutput()
    val input = ConsoleInput()

    val game = ChessGame(config, output, input)

    game.start()
    game.stepByStep()
}