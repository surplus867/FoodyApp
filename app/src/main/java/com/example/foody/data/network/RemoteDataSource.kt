package com.example.foody.data.network

import com.example.foody.data.FoodRecipesApi
import com.example.foody.models.FoodRecipe
import dagger.hilt.InstallIn
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

   suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
       return foodRecipesApi.getRecipes(queries)
    }
}