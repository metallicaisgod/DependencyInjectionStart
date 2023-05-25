package com.kirillmesh.dependencyinjectionstart.example2.domain

import javax.inject.Inject

data class ExampleUseCase @Inject constructor(
    private val repository: ExampleRepository
){
    operator fun invoke() {
        repository.method()
    }
}
