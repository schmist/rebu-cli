package com.syncatec.rebu.cmd

class CmdImpl(private val cmd: String, private val arguments: List<String>, processFactory: ProcessFactory) : Cmd {

    override fun run() {
        println("$cmd $arguments")
    }
}