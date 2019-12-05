package dev.drf.core.input

import dev.drf.core.data.Move

interface CommandDetectorChain {
    fun startChain(command: String): Move
    fun next(): CommandDetectorChain
}