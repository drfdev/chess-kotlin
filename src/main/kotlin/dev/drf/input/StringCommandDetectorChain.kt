package dev.drf.input

import dev.drf.core.data.Move
import dev.drf.core.data.MoveContext
import dev.drf.core.data.chessboardCellOf
import dev.drf.core.input.CommandDetectorChain

class StringCommandDetectorChain : CommandDetectorChain {
    lateinit var next: CommandDetectorChain

    override fun execute(command: String): MoveContext {
        // TODO
        return MoveContext(Move(
                chessboardCellOf(1, 1),
                chessboardCellOf(2, 2)
        ))
    }

    override fun next(): CommandDetectorChain {
        return next
    }
}