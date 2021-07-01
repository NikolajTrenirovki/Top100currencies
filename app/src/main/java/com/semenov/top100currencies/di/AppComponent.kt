package com.semenov.top100currencies.di

import com.semenov.top100currencies.activities.ChartActivity
import com.semenov.top100currencies.activities.MainActivity
import com.semenov.top100currencies.chart.LatestChart
import com.semenov.top100currencies.fragments.CurrenciesListFragment
import com.semenov.top100currencies.mvp.presenter.CurrenciesPresenter
import com.semenov.top100currencies.mvp.presenter.LatestChartPresenter
import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class, RestModule::class, MvpModule::class, ChartModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(presenter: CurrenciesPresenter)

    fun inject(presenter: LatestChartPresenter)

    fun inject(fragment: CurrenciesListFragment)

    fun inject(chart: LatestChart)

    fun inject(activity: ChartActivity)
}