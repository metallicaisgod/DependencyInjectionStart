package com.kirillmesh.dependencyinjectionstart.example2.di

import com.kirillmesh.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.kirillmesh.dependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}