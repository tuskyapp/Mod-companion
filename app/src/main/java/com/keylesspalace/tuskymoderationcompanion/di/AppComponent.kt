package com.keylesspalace.tuskymoderationcompanion.di

import com.keylesspalace.tuskymoderationcompanion.ModCompanionApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules= [
    AppModule::class,
    AndroidInjectionModule::class,
    ActivitiesModule::class,
    NetworkModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun applicationBind(modCompanionApp: ModCompanionApp): Builder

        fun build(): AppComponent
    }

    fun inject(app: ModCompanionApp)
}