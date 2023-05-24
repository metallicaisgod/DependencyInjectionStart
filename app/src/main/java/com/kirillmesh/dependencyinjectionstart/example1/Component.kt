package com.kirillmesh.dependencyinjectionstart.example1

class Component {

    private fun getComputer(): Computer {
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val systemBlock = SystemBlock(
            Memory(),
            Processor(),
            Storage()
        )
        return Computer(monitor, systemBlock, keyboard, mouse)
    }

    fun inject(activity: Activity){
        activity.keyboard = Keyboard()
    }
}