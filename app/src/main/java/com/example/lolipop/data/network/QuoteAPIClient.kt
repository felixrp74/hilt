package com.example.lolipop.data.network

import com.example.lolipop.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteAPIClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}