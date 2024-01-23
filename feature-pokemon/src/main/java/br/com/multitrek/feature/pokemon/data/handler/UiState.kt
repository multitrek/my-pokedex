package br.com.multitrek.feature.pokemon.data.handler

sealed class UiState<out T> {

    data object OnLoading : UiState<Nothing>()
    data class OnSuccess<T>(val response: T) : UiState<T>()
    data class OnError(val exception: Throwable) : UiState<Nothing>()
}
