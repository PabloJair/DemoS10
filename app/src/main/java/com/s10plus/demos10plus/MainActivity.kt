package com.s10plus.demos10plus

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.s10plus.demos10plus.areas.meals.AreasMealsAdapter
import com.s10plus.demos10plus.core.BaseFetchData
import com.s10plus.demos10plus.databinding.ActivityMainBinding
import com.s10plus.demos10plus.meal.remote.entities.Meals
import com.s10plus.demos10plus.meal.remote.entities.MealsArea
import com.s10plus.demos10plus.viewmodel.MealViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MealViewModel>()

    private lateinit var binding:ActivityMainBinding

    private var adapter = AreasMealsAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        binding.recyclerView.adapter = adapter
        viewModel.getMealsArea()
        viewModel.fetchData().observe(this,::onObserverViewModel)

    }

    private fun onObserverViewModel(fetchData: BaseFetchData){
        when(fetchData){
            is BaseFetchData.Error -> {
                Log.d("Error",fetchData.message)
            }
            is BaseFetchData.Loader -> {
                Log.d("Loader",fetchData.isShow.toString())
            }
            is BaseFetchData.Success -> {
                adapter.setupItems((fetchData.data as MealsArea).itemMeals)

            }
        }
    }
}