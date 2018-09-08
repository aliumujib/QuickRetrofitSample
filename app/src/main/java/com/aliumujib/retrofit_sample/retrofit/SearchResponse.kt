package com.aliumujib.retrofit_sample.retrofit

import com.aliumujib.retrofit_sample.model.Repository
import com.google.gson.annotations.SerializedName


data class SearchResponse(
        @SerializedName("total_count") val totalCount: Int?,
        @SerializedName("incomplete_results") val incompleteResults: Boolean?,
        @SerializedName("items") val items: List<Repository>?
)