package dev.drf.input.chain

import dev.drf.core.data.*
import dev.drf.input.CommandContext
import dev.drf.input.StringCommandDetectorChain
import dev.drf.util.stringToCell

class BuildMoveChain : StringCommandDetectorChain() {
    private val exitCommand = MoveContext(
            Move(
                    chessboardCellOf(1,1),
                    chessboardCellOf(1,1)
            ),
            ContextType.EXIT
    )

    override fun executeCommand(command: CommandContext): CommandContext {
        if (command.command == "EXIT") {
            val context = CommandContext(command.command)
            context.moveContext = exitCommand
            return context
        }
        val moves = command.command.split('-')

        val context = CommandContext(command.command)
        context.moveContext = MoveContext(
                Move(
                        stringToCell(moves[0]),
                        stringToCell(moves[1])
                )
        )

        return context
    }
}