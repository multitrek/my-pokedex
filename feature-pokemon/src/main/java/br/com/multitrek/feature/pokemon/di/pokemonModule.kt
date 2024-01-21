package br.com.multitrek.feature.pokemon.di

import br.com.multitrek.feature.pokemon.data.provider.NetworkProvider.serviceProvider
import br.com.multitrek.feature.pokemon.data.repository.PokemonRepository
import br.com.multitrek.feature.pokemon.data.repository.PokemonRepositoryImpl
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

val pokemonModule = module {
    factoryOf(::PokemonRepositoryImpl) bind PokemonRepository::class

    factory { serviceProvider() }
}
