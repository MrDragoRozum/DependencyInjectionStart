package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ModuleComputerTower {

    @Provides
    fun provideStorage() = Storage()

    @Provides
    fun provideMemory() = Memory()

    @Provides
    fun provideProcessor() = Processor()
}