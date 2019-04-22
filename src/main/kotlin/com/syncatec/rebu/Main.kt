package com.syncatec.rebu

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.NoRunCliktCommand
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.options.versionOption

class RebuCommand(rebu: Rebu) : NoRunCliktCommand(name = rebu.name) {

    init {
        versionOption(rebu.version)
    }
}

class RegisterCommand : CliktCommand(name = "register") {

    override fun run() {
        echo("register")
    }
}

fun main(args: Array<String>) =
    RebuCommand(RebuImpl()).subcommands(RegisterCommand()).main(args)