package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component(modules = [ModuleComputer::class, ModuleComputerTower::class])
interface IComponent {
    fun inject(activity: Activity)
}