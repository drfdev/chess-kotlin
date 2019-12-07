package dev.drf.core.input

interface Chain<T, N> {
    fun execute(command: T): N
}