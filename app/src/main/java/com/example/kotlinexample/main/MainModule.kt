package com.example.kotlinexample.main

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
object MainModule {

    @Provides
    fun provideMainAdapter(): MainAdapter = MainAdapter()

}