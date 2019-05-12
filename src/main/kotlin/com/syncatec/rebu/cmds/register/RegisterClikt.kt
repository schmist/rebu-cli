package com.syncatec.rebu.cmds.register

import com.github.ajalt.clikt.core.CliktCommand
import javax.inject.Inject

class RegisterClikt @Inject constructor() : CliktCommand(name = "register") {

    override fun run() {
        echo("register")
    }
}