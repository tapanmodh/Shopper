package com.tm.domain.usecase

import com.tm.domain.repository.ProductRepository

class GetProductUseCase (private val repository: ProductRepository) {
    suspend fun execute() = repository.getProducts()
}