package com.theandroidcafe.dictionaryapp.search

import com.theandroidcafe.dictionaryapp.search.data.remote.dto.WordDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApiService {

    @GET("/api/v2/entries/en/{word}")
    fun getWords(
        @Path("word") word: String
    ) : List<WordDto>

}