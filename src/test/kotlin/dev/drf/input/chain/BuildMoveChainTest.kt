package dev.drf.input.chain

import dev.drf.core.data.ContextType
import dev.drf.input.CommandContext
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BuildMoveChainTest {
    private val chain = BuildMoveChain()

    @Test
    fun testExitCommand() {
        val context = chain.execute(CommandContext("EXIT"))

        assertEquals(ContextType.EXIT, context.contextType)
    }

    @Test
    fun testStringCommand() {
        val context = chain.execute(CommandContext("A1-H8"))

        assertEquals(ContextType.MOVE_FIGURE, context.contextType)

        assertEquals(0, context.move.start.row)
        assertEquals(0, context.move.start.cell)
        assertEquals(7, context.move.end.row)
        assertEquals(7, context.move.end.cell)
    }
}