package br.com.multitrek.feature.pokemon.data.repository

import br.com.multitrek.feature.pokemon.data.dto.PokemonListDTO
import br.com.multitrek.feature.pokemon.data.remote.PokemonApi
import kotlinx.coroutines.flow.Flow

class PokemonRepositoryImpl(
    private val api: PokemonApi
) : PokemonRepository {

    override suspend fun getPokemonList(): Flow<PokemonListDTO> =
        api.getPokemonList(20, 0)
}
