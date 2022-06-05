package com.s10plus.demos10plus.meal.remote.datasource

import com.s10plus.demos10plus.meal.remote.service.MealService
import javax.inject.Inject

class DataSourceMeal  @Inject constructor(private val service: MealService){
    suspend fun getRandom()= service.mealRandom()
    suspend fun getMealsArea() = service.mealsArea()

}