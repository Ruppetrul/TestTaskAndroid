package com.example.data.remote

import com.example.data.repositories.RetrofitFactory
import com.example.domain.response.pokemon.Pokemon
import okhttp3.ResponseBody
import retrofit2.Response


class PokemonProviderImpl : PokemonProvider {
    override suspend fun getPokemon(id: Int): Response<Pokemon> {
        return RetrofitFactory.getApiService().fetchPokemon(id)
    }

}