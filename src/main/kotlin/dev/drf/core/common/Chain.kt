package dev.drf.core.common

interface Chain<T, N> {
    fun execute(command: T): N
}