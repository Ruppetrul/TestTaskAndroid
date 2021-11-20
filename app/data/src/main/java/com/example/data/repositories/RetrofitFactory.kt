package com.example.data.repositories

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.logging.Level

class RetrofitFactory {

    companion object {
        const val BASE_URL = "https://pokeapi.co/api/v2/"

        private fun getOkHttpInstance(): OkHttpClient {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY

            return OkHttpClient.Builder()
                .addInterceptor(logging)
                .followRedirects(false)

                .build()
        }

        private fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(getOkHttpInstance())
                //.addConverterFactory(Json.nonstrict.asConverterFactory(contentType = "application/json".toMediaType()))
                .addConverterFactory(GsonConverterFactory.create())

                //.addCallAdapterFactory(CoroutineCallAdapterFactory())
                .build()
        }

        fun getApiService() = getRetrofitInstance().create(PokeapiService::class.java)
    }
}