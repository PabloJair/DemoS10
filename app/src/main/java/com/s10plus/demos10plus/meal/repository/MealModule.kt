package com.s10plus.demos10plus.meal.repository

import com.s10plus.demos10plus.meal.remote.service.MealService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MealModule {
    @Singleton
    @Provides
    fun provideCurrencyService(@Named("RetrofitPROD") retrofit: Retrofit): MealService =
        retrofit.create(MealService::class.java)
}