package com.syncatec.rebu.cmds.register

import com.github.ajalt.clikt.core.CliktCommand
import com.syncatec.rebu.cmd.Cmd
import javax.inject.Inject
import javax.inject.Named

class RegisterClikt @Inject constructor(
    @Named("sshCopyId") private val cmd: Cmd
) : CliktCommand(name = "register") {

    override fun run() {
        cmd.run(listOf("rebu@test"))
    }
}