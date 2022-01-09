package com.example.foody.models


import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import com.example.foody.models.ExtendedIngredient
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class Result(
    @SerializedName("aggregateLikes")
    val aggregateLikes: Int? = null,
    @SerializedName("cheap")
    val cheap: Boolean? = null,
    @SerializedName("dairyFree")
    val dairyFree: Boolean,
    @SerializedName("extendedIngredients")
    val extendedIngredients: @RawValue List<ExtendedIngredient>? = null,
    @SerializedName("glutenFree")
    val glutenFree: Boolean,
    @SerializedName("id")
    val resultId: Int? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("readyInMinutes")
    val readyInMinutes: Int? = null,
    @SerializedName("sourceName")
    val sourceName: String? = null,
    @SerializedName("sourceUrl")
    val sourceUrl: String? = null,
    @SerializedName("summary")
    val summary: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("vegan")
    val vegan: Boolean,
    @SerializedName("vegetarian")
    val vegetarian: Boolean,
    @SerializedName("veryHealthy")
    val veryHealthy: Boolean,
): Parcelable