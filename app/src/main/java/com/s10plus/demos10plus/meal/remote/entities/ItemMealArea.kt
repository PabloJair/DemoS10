package com.s10plus.demos10plus.meal.remote.entities
import com.google.gson.annotations.SerializedName


data class ItemMealArea(
    @SerializedName("strArea")
    val strArea: String
)
data class MealsArea(
    @SerializedName("meals") val itemMeals:ArrayList<ItemMealArea>
)