package com.theandroidcafe.dictionaryapp.domain.model
import com.google.gson.annotations.SerializedName

data class Phonetic(
    val audio: String,
    val sourceUrl: String,
    val text: String
)