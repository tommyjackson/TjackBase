package com.tjackapps.tjackbase.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import timber.log.Timber

@Module
@InstallIn(FragmentComponent::class)
class BaseModule {
    @Provides
    fun providesTimber() = Timber.asTree()
}