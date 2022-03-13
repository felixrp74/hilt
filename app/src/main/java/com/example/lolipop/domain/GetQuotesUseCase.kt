package com.example.lolipop.domain

import com.example.lolipop.data.QuoteRepository
import com.example.lolipop.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository : QuoteRepository
    ) {
    suspend operator fun invoke(): List<QuoteModel> = repository.getAllQuotes()
}