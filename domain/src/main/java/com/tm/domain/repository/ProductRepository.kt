package com.tm.domain.repository

import com.tm.domain.model.Product
import com.tm.domain.network.ResultWrapper

interface ProductRepository {
    suspend fun getProducts(): ResultWrapper<List<Product>>
}