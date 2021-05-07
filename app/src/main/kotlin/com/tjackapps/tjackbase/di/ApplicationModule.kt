package com.tjackapps.tjackbase.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
//import timber.log.Timber

@Module
@InstallIn(FragmentComponent::class)
class ApplicationModule {
//    @Provides
//    fun providesTimber() = Timber.asTree()
}