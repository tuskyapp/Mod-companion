package com.keylesspalace.tuskymoderationcompanion.di

import com.keylesspalace.tuskymoderationcompanion.ModCompanionApp

object AppInjector {

    fun init(app: ModCompanionApp) {
        DaggerAppComponent
            .builder()
            .applicationBind(app)
            .build()
            .inject(app)
    }
}