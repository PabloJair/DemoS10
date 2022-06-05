package com.s10plus.demos10plus.meal.remote.service

import com.s10plus.demos10plus.meal.remote.entities.Meals
import com.s10plus.demos10plus.meal.remote.entities.MealsArea
import retrofit2.Response
import retrofit2.http.GET




interface MealService {
    @GET(EndPoints.RAMDOM)
    suspend fun mealRandom(): Response<Meals>

    @GET(EndPoints.AREA_MEALS)
    suspend fun mealsArea(): Response<MealsArea>
}