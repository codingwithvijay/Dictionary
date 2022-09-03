package com.theandroidcafe.dictionaryapp.domain.model

import com.google.gson.annotations.SerializedName

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val synonyms: List<String>,
    val example: String?
)
