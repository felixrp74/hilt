package com.example.lolipop.data

import com.example.lolipop.data.model.QuoteModel
import com.example.lolipop.data.model.QuoteProvider
import com.example.lolipop.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api:QuoteService,
    private val quoteProvider: QuoteProvider
    ) {
    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}