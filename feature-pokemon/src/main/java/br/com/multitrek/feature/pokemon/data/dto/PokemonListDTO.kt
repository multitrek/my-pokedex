package br.com.multitrek.feature.pokemon.data.dto

import com.google.gson.annotations.SerializedName

data class PokemonListDTO(
    @SerializedName("results")
    val results: List<PokemonDTO>,
)
