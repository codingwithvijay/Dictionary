package com.theandroidcafe.dictionaryapp.domain.model

import com.google.gson.annotations.SerializedName

data class Meaning(
    val antonyms: List<String>,
    val definitions: List<Definition>,
    val partOfSpeech: String,
    val synonyms: List<String>
)
