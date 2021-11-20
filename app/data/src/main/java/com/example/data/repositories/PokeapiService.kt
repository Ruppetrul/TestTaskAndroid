package com.example.data.repositories

import com.example.domain.response.pokemon.Pokemon
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeapiService {

    @GET("pokemon/{id}/")
    suspend fun fetchPokemon(
        @Path("id") id: Int
    ) : Response<Pokemon>



}