package com.syncatec.rebu.cmd

interface Cmd {

    fun run(arguments: List<String>)
}