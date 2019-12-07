package dev.drf.core.input

import dev.drf.core.data.Move

interface CommandDetectorChain : Chain<String, Move> {
    override fun execute(command: String): Move
    fun next(): CommandDetectorChain
}