package com.kirillmesh.dependencyinjectionstart.example1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}