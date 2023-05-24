package com.kirillmesh.dependencyinjectionstart.example1

class Activity {

    //val computer = Component.getComputer()
    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}