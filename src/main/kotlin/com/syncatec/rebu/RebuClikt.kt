package com.syncatec.rebu

import com.github.ajalt.clikt.core.NoRunCliktCommand
import com.github.ajalt.clikt.parameters.options.versionOption
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RebuClikt @Inject constructor(rebu: Rebu) : NoRunCliktCommand(name = rebu.name) {

    init {
        versionOption(rebu.version)
    }
}