package com.keylesspalace.tuskymoderationcompanion.di

import com.keylesspalace.tuskymoderationcompanion.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesMainActivity(): MainActivity
}