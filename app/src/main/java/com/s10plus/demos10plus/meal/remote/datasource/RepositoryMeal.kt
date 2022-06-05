package com.s10plus.demos10plus.meal.remote.datasource

import com.s10plus.demos10plus.meal.remote.entities.Meals
import com.s10plus.demos10plus.meal.remote.entities.MealsArea
import com.s10plus.demos10plus.network.BaseApiResponse
import com.s10plus.demos10plus.network.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class RepositoryMeal @Inject constructor(
    private val remote: DataSourceMeal): BaseApiResponse() {
    suspend fun getMealRandom(): Flow<NetworkResult<Meals>> =
        flow {
            emit(NetworkResult.Loading(true))
            emit(safeApiCall { remote.getRandom() })
            delay(2000)
            emit(NetworkResult.Loading(false))
        }.flowOn(Dispatchers.IO)

    suspend fun getMealsArea(): Flow<NetworkResult<MealsArea>> =
        flow {
            emit(NetworkResult.Loading(true))
            emit(safeApiCall { remote.getMealsArea() })
            delay(2000)
            emit(NetworkResult.Loading(false))
        }.flowOn(Dispatchers.IO)
}