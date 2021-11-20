package com.example.data.remote

import com.example.domain.response.pokemon.Pokemon
import okhttp3.ResponseBody
import retrofit2.Response

interface PokemonProvider {

    suspend fun getPokemon(id: Int) : Response<Pokemon>

}