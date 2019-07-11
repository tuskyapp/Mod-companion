package com.keylesspalace.tuskymoderationcompanion

import android.app.Application
import com.keylesspalace.tuskymoderationcompanion.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class ModCompanionApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        initAppInjector()
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }

    fun initAppInjector() {
        AppInjector.init(this)
    }

}