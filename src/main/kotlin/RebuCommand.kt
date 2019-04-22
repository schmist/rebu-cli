import com.github.ajalt.clikt.core.NoRunCliktCommand
import com.github.ajalt.clikt.parameters.options.versionOption

class RebuCommand : NoRunCliktCommand(name = name) {

    companion object {
        private const val name = "rebu"
        private const val versionFileName = "version.txt"
    }

    init {
        versionOption(version())
    }

    private fun version(): String =
        javaClass.getResourceAsStream(versionFileName)
            .bufferedReader()
            .use { it.readLine() }
}