package com.theandroidcafe.dictionaryapp.search.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.theandroidcafe.dictionaryapp.domain.model.Phonetic

data class PhoneticDto(
    @SerializedName("audio")
    val audio: String,
    @SerializedName("sourceUrl")
    val sourceUrl: String,
    @SerializedName("text")
    val text: String
) {
    fun toPhonetic() = Phonetic(
        audio = audio,
        sourceUrl = sourceUrl,
        text = text
    )
}