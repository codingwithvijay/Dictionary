package com.theandroidcafe.dictionaryapp.search.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.theandroidcafe.dictionaryapp.domain.model.Meaning
import com.theandroidcafe.dictionaryapp.domain.model.Phonetic

@Entity
data class WordEntity(
    val meanings: List<Meaning>,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val sourceUrls: List<String>,
    val word: String,
    @PrimaryKey(autoGenerate = true) val id: Int
) {
}