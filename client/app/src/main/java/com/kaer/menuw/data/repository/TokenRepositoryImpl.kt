package com.kaer.menuw.data.repository

import androidx.datastore.core.DataStore
import com.kaer.menuw.domain.entity.Token
import com.kaer.menuw.domain.repository.TokenRepository
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class TokenRepositoryImpl @Inject constructor(private val dataStore: DataStore<Token>): TokenRepository {

    override suspend fun setToken(accessToken: String, refreshToken: String) {
        dataStore.updateData { Token(accessToken, refreshToken) }
    }

    override suspend fun getToken(): Token = dataStore.data.first()
}