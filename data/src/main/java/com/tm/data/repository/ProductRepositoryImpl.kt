package com.tm.data.repository

import com.tm.domain.model.Product
import com.tm.domain.network.NetworkService
import com.tm.domain.network.ResultWrapper
import com.tm.domain.repository.ProductRepository

class ProductRepositoryImpl(private val networkService: NetworkService) : ProductRepository {
    override suspend fun getProducts(): ResultWrapper<List<Product>> {
        return networkService.getProducts()
    }

}