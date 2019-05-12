package com.syncatec.rebu

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [RebuModule.Bindings::class])
class RebuModule {

    @Module
    interface Bindings {

        @Binds
        @Singleton
        fun providesRebu(rebuImpl: RebuImpl): Rebu
    }
}