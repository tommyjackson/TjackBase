package com.tjackapps.logging.di

import com.tjackapps.logging.Logger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import timber.log.Timber

@Module
@InstallIn(SingletonComponent::class)
class LoggingModule {

    @Provides
    fun providesLogger(): Logger {
        return Logger(providesTimber())
    }

    @Provides
    fun providesTimber(): Timber.Tree {
        return Timber.asTree()
    }
}