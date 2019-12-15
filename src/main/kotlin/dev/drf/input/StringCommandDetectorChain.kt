package dev.drf.input

import dev.drf.core.data.MoveContext
import dev.drf.core.input.CommandDetectorChain

abstract class StringCommandDetectorChain : CommandDetectorChain {
    var next: CommandDetectorChain? = null

    override fun execute(command: CommandContext): MoveContext {
        val context = executeCommand(command)
        return if (next != null ) next!!.execute(context) else context.moveContext!!
    }

    abstract fun executeCommand(command: CommandContext): CommandContext
}