package com.syncatec.rebu

import com.syncatec.rebu.cmd.CmdModule
import com.syncatec.rebu.cmds.register.RegisterClikt
import com.syncatec.rebu.cmds.register.RegisterModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        RebuModule::class,
        CmdModule::class,
        RegisterModule::class
    ]
)
interface RebuComponent {

    val rebuClikt: RebuClikt
    val registerClikt: RegisterClikt
}