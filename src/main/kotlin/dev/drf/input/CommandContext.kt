package dev.drf.input

import dev.drf.core.data.MoveContext

class CommandContext(val command: String) {
    var moveContext: MoveContext? = null
}