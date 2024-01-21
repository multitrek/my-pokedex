package br.com.multitrek.feature.pokemon.data.remote

import br.com.multitrek.feature.pokemon.data.dto.PokemonDTO
import br.com.multitrek.feature.pokemon.data.dto.PokemonListDTO
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {

    @GET("pokemon/")
    suspend fun getPokemonList(
        @Query("limit") limit: Int?,
        @Query("offset") offset: Int?
    ): Flow<PokemonListDTO>

    @GET("pokemon/{id}/")
    suspend fun getPokemon(@Path("id") url: String): Flow<PokemonDTO>
}
