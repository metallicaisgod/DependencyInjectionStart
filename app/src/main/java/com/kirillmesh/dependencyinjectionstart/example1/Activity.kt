package com.kirillmesh.dependencyinjectionstart.example1

class Activity {
    val monitor = Monitor()
    val keyboard = Keyboard()
    val mouse = Mouse()
    val systemBlock = SystemBlock(
        Memory(),
        Processor(),
        Storage()
    )
    val computer = Computer(monitor, systemBlock, keyboard, mouse)
}