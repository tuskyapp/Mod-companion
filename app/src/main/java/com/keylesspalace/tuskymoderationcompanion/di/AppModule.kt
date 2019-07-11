package com.keylesspalace.tuskymoderationcompanion.di

import android.app.Application
import android.content.Context
import com.keylesspalace.tuskymoderationcompanion.ModCompanionApp
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun providesApplication(app: ModCompanionApp): Application = app

    @Provides
    fun providesContext(app: Application): Context = app
}