package dev.drf.input.chain

import dev.drf.input.CommandContext
import dev.drf.input.StringCommandDetectorChain

class RemoveWhitespacesChain : StringCommandDetectorChain() {
    override fun executeCommand(command: CommandContext): CommandContext {
        return CommandContext(
                command.command.replace("[\\s]*".toRegex(), "")
        )
    }
}