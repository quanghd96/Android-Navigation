package com.example.pedrobatista.kotlinstarter.common.modules

import android.content.Context
import com.example.pedrobatista.kotlinstarter.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(app: App): Context = app
}