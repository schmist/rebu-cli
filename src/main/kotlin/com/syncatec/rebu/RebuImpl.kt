package com.syncatec.rebu

class RebuImpl : Rebu {

    companion object {
        const val versionFileName = "version.txt"
    }

    override val name: String = "rebu"

    override val version: String by lazy { version() }

    private fun version(): String =
        javaClass.getResourceAsStream(versionFileName)
            .bufferedReader()
            .use { it.readLine() }
}