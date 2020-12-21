package com.example.kotlinexample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    private const val TIMEOUT_CONNECT = 30L

    private fun createLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor()

    @Provides
    fun provideOkHttpClient() = OkHttpClient.Builder()
        .connectTimeout(TIMEOUT_CONNECT, TimeUnit.SECONDS)
        .writeTimeout(TIMEOUT_CONNECT, TimeUnit.SECONDS)
        .addInterceptor(createLoggingInterceptor())
        .build()

}