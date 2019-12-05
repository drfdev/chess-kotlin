package dev.drf.input

import dev.drf.core.input.CommandDetectorChain

fun stringChainBuilder(): StringChainBuilder {
    return StringChainBuilder()
}
class StringChainBuilder {
    private val chain: StringCommandDetectorChain = StringCommandDetectorChain()

    fun build(): CommandDetectorChain {
        return chain
    }
    fun nextChain(chain: CommandDetectorChain): StringChainBuilder {
        // TODO chain
        return this
    }
}