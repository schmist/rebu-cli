package com.syncatec.rebu.cmds.register

import com.syncatec.rebu.cmd.Cmd
import com.syncatec.rebu.cmd.CmdImpl
import com.syncatec.rebu.cmd.ProcessFactory
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class RegisterModule {

    @Provides
    @Singleton
    @Named("sshCopyId")
    fun providesSshCopyId(processFactory: ProcessFactory): Cmd =
        CmdImpl("ssh-copy-id", processFactory)
}