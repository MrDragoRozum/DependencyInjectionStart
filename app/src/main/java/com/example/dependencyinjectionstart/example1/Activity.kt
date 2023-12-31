package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer
    init {
        DaggerIComponent.create().inject(this)
    }
}