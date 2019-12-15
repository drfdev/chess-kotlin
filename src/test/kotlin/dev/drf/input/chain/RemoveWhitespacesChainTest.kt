package dev.drf.input.chain

import dev.drf.input.CommandContext
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveWhitespacesChainTest {
    private val chain = RemoveWhitespacesChain()

    @Test
    fun testRemoveSpaces() {
        val context = chain.executeCommand(CommandContext("  A1  -    B4   "))

        assertEquals("A1-B4", context.command)
    }
}