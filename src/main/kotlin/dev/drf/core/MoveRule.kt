package dev.drf.core

interface MoveRule {
    fun check(current: CheckerboardCell, future: CheckerboardCell)
}