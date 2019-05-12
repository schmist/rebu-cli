package com.syncatec.rebu

import com.syncatec.rebu.cmd.CmdModule
import com.syncatec.rebu.cmds.register.RegisterClikt
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        RebuModule::class,
        CmdModule::class
    ]
)
interface RebuComponent {

    val rebuClikt: RebuClikt
    val registerClikt: RegisterClikt
}