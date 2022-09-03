package com.theandroidcafe.dictionaryapp.search.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.theandroidcafe.dictionaryapp.domain.model.Meaning

data class MeaningDto(
    @SerializedName("antonyms")
    val antonyms: List<String>,
    @SerializedName("definitions")
    val definitions: List<DefinitionDto>,
    @SerializedName("partOfSpeech")
    val partOfSpeech: String,
    @SerializedName("synonyms")
    val synonyms: List<String>
) {
    fun toMeaning() = Meaning(
        antonyms = antonyms,
        definitions = definitions.map { it.toDefinition() },
        partOfSpeech = partOfSpeech,
        synonyms = synonyms
    )
}