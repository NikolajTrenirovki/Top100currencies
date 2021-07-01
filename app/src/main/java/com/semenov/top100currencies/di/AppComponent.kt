package com.semenov.top100currencies.di

import com.semenov.top100currencies.activities.MainActivity
import dagger.Component
//import info.fandroid.top100currencies.activities.MainActivity
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class, RestModule::class, MvpModule::class, ChartModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)


}