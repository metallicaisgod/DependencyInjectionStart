package com.kirillmesh.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor() : Monitor{
        return Monitor()
    }

    @Provides
    fun provideKeyboard() : Keyboard{
        return Keyboard()
    }

    @Provides
    fun provideMouse() : Mouse{
        return Mouse()
    }

    @Provides
    fun provideStorage() : Storage{
        return Storage()
    }

    @Provides
    fun provideMemory() : Memory{
        return Memory()
    }

    @Provides
    fun provideProcessor() : Processor{
        return Processor()
    }

    @Provides
    fun provideSystemBlock(
        processor: Processor,
        memory: Memory,
        storage: Storage
    ) : SystemBlock{
        return SystemBlock(memory, processor, storage)
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        systemBlock: SystemBlock,
        keyboard: Keyboard,
        mouse: Mouse
    ) : Computer{
        return Computer(monitor, systemBlock, keyboard, mouse)
    }
}