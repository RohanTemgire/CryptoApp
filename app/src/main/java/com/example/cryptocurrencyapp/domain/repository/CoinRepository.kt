package com.example.cryptocurrencyapp.domain.repository

import com.example.cryptocurrencyapp.data.model.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp.data.model.remote.dto.CoinDto


// why we need repository in data and domain?
// suppose we want to test our application, now if there is only one repository then it will take our firebase storage, etc
// since we will have to make api requests to test our app;
// now if we have two repositories we can use one as interface and than we can just implement their members.
// this way while testing we can make replica of the data

interface CoinRepository {
    suspend fun getCoins() : List<CoinDto>
    suspend fun getCoinById(coinId : String) : CoinDetailDto
}