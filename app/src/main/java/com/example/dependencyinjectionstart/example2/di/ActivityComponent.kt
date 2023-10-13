package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [ViewModelModel::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface ActivityComponentFactory {
        fun create(
            @BindsInstance id: String
        ): ActivityComponent
    }
}