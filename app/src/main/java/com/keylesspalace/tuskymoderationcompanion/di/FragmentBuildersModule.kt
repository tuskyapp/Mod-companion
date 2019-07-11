package com.keylesspalace.tuskymoderationcompanion.di

import com.keylesspalace.tuskymoderationcompanion.fragments.AccountFragment
import com.keylesspalace.tuskymoderationcompanion.fragments.HomeFragment
import com.keylesspalace.tuskymoderationcompanion.fragments.ReportFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun homeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun accountFragment(): AccountFragment

    @ContributesAndroidInjector
    abstract fun reportFragment(): ReportFragment
}