package dev.drf.core.input

import dev.drf.core.common.Chain
import dev.drf.core.data.MoveContext

interface CommandDetectorChain : Chain<String, MoveContext> {
    override fun execute(command: String): MoveContext
    fun next(): CommandDetectorChain
}