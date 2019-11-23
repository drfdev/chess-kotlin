package dev.drf.core

import dev.drf.core.data.CheckerboardCell

interface MoveRule {
    fun check(current: CheckerboardCell, future: CheckerboardCell)
}