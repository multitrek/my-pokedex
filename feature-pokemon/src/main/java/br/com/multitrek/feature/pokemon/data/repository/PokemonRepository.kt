package br.com.multitrek.feature.pokemon.data.repository

import br.com.multitrek.feature.pokemon.data.dto.PokemonListDTO
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

    suspend fun getPokemonList(): Flow<PokemonListDTO>
}
