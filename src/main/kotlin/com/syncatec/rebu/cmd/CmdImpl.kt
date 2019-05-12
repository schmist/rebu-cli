package com.syncatec.rebu.cmd

class CmdImpl(private val cmd: String, processFactory: ProcessFactory) : Cmd {

    override fun run(arguments: List<String>) {
        println("$cmd $arguments")
    }
}