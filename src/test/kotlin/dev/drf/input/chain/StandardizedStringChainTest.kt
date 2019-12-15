package dev.drf.input.chain

import dev.drf.input.CommandContext
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StandardizedStringChainTest {
    private val chain = StandardizedStringChain()

    @Test
    fun testUpperCase() {
        val context = chain.executeCommand(CommandContext("a1-h5"))

        assertEquals("A1-H5", context.command)
    }
}