package com.theandroidcafe.dictionaryapp.search.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.theandroidcafe.dictionaryapp.domain.model.Definition

data class DefinitionDto(
    @SerializedName("antonyms")
    val antonyms: List<String>,
    @SerializedName("definition")
    val definition: String,
    @SerializedName("synonyms")
    val synonyms: List<String>,
    @SerializedName("example")
    val example: String?
) {
    fun toDefinition() = Definition(
        antonyms = antonyms,
        definition = definition,
        synonyms = synonyms,
        example = example
    )
}