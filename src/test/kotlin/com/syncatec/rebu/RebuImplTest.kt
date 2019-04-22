package com.syncatec.rebu

import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import java.io.File

class RebuImplTest {

    private lateinit var rebu: Rebu

    @Before
    fun setUp() {
        rebu = RebuImpl()
    }

    @Test
    fun nameReturnsName() {
        val result = rebu.name

        assertThat(result, iz("rebu"))
    }

    @Test
    fun versionReadsVersionFromFile() {
        val resources = File(javaClass.getResource(".").file)
        val versionFile = File(resources, "version.txt")
        val version = "42"
        versionFile.createNewFile()
        versionFile.writeText(version)

        val result = rebu.version

        assertThat(result, iz(version))
    }

    @Test
    fun versionReadsVersionFromFileOnlyOnce() {
        val resources = File(javaClass.getResource(".").file)
        val versionFile = File(resources, "version.txt")
        val version = "42"
        versionFile.createNewFile()
        versionFile.writeText(version)
        rebu.version
        versionFile.delete()

        val result = rebu.version

        assertThat(result, iz(version))
    }
}