package com.syncatec.rebu

import com.github.ajalt.clikt.core.NoRunCliktCommand
import com.github.ajalt.clikt.parameters.options.versionOption

class RebuCommand(rebu: Rebu) : NoRunCliktCommand(name = rebu.name) {

    init {
        versionOption(rebu.version)
    }
}

fun main(args: Array<String>) =
    RebuCommand(RebuImpl()).main(args)