package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component
interface IComponent {
    fun inject(activity: Activity)
}