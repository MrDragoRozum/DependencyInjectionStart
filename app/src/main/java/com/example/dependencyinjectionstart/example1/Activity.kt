package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {
    val keyboard = DaggerIComponent.create().getKeyboard()
    val mouse = DaggerIComponent.create().getMouse()
    val monitor = DaggerIComponent.create().getMonitor()

    @Inject
    lateinit var keyboardInject: Keyboard

    @Inject
    lateinit var mouseInject: Mouse

    @Inject
    lateinit var monitorInject: Monitor

    init {
        DaggerIComponent.create().inject(this)
    }
}