package com.example.cryptocurrencyapp.data.model.remote

import com.example.cryptocurrencyapp.data.model.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp.data.model.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins() : List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String) : CoinDetailDto

}