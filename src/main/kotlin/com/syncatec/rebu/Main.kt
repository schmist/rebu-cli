package com.syncatec.rebu

import com.github.ajalt.clikt.core.subcommands


fun main(args: Array<String>) {

    val rebu = DaggerRebuComponent.create()

    rebu.rebuClikt
        .subcommands(
            rebu.registerClikt
        )
        .main(args)
}
