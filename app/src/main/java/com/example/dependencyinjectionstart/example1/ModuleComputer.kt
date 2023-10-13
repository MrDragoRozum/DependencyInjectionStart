package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ModuleComputer {
    @Provides
    fun provideMonitor() = Monitor()

    @Provides
    fun provideMouse() = Mouse()

    @Provides
    fun provideKeyboard() = Keyboard()

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ) = ComputerTower(storage, memory, processor)

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ) = Computer(monitor, computerTower, keyboard, mouse)
}