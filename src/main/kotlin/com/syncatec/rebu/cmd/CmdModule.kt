package com.syncatec.rebu.cmd

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [CmdModule.Bindings::class])
class CmdModule {

    @Module
    interface Bindings {

        @Binds
        @Singleton
        fun providesProcessFactory(processFactoryImpl: ProcessFactoryImpl): ProcessFactory
    }
}