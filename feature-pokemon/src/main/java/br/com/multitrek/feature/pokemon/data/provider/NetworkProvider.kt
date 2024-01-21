package br.com.multitrek.feature.pokemon.data.provider

import br.com.multitrek.feature.pokemon.data.remote.PokemonApi
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory

object NetworkProvider {

    fun serviceProvider(): PokemonApi = getRetrofit().create(PokemonApi::class.java)

    private fun getRetrofit(): Retrofit = Builder()
        .baseUrl("https://pokeapi.co/api/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}
