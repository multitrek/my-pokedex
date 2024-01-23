package br.com.multitrek.feature.pokemon.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.multitrek.feature.pokemon.data.dto.PokemonListDTO
import br.com.multitrek.feature.pokemon.data.handler.UiState
import br.com.multitrek.feature.pokemon.data.repository.PokemonRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class PokemonsViewModel(
    private val repository: PokemonRepository
) : ViewModel() {


    private val _list = MutableStateFlow<UiState<PokemonListDTO>>(UiState.OnLoading)
    val list: StateFlow<UiState<PokemonListDTO>> = _list

    init {
        getPokemonList()
    }

    private fun getPokemonList() {
        viewModelScope.launch {
            repository.getPokemonList()
                .onStart {
                    _list.value = UiState.OnLoading
                }
                .catch {
                    _list.value = UiState.OnError(it)
                }
                .collect {
                    _list.value = UiState.OnSuccess(it)
                }
        }
    }
}
