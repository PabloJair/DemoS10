package com.s10plus.demos10plus.viewmodel

import android.app.Application
import androidx.lifecycle.viewModelScope
import com.s10plus.demos10plus.core.BaseObservable
import com.s10plus.demos10plus.meal.remote.datasource.RepositoryMeal
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlinx.coroutines.flow.collect

@HiltViewModel
class MealViewModel @Inject constructor(
    private val repository: RepositoryMeal,
    application: Application
):BaseObservable(application) {

    fun getRandomMeal()=viewModelScope.launch {
        repository.getMealRandom().collect{
            setupLiveData(it)

        }
    }

    fun getMealsArea()=viewModelScope.launch {
        repository.getMealsArea().collect{
            setupLiveData(it)

        }
    }
}