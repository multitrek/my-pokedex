package br.com.multitrek.feature.pokemon.data.dto

import com.google.gson.annotations.SerializedName

data class PokemonDTO(
    @SerializedName("name")
    val name: String?,

    @SerializedName("url")
    val url: String?
)
