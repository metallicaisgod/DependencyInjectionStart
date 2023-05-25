package com.kirillmesh.dependencyinjectionstart.example2.di

import android.content.Context
import com.kirillmesh.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DomainModule::class, DataModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun timeMillis(timeMillis: Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent
    }
}