package dev.drf.core.input

import dev.drf.core.common.Chain
import dev.drf.core.data.MoveContext
import dev.drf.input.CommandContext

interface CommandDetectorChain : Chain<CommandContext, MoveContext> {
    override fun execute(command: CommandContext): MoveContext
}