package com.tm.data.di

import com.tm.data.repository.ProductRepositoryImpl
import com.tm.domain.repository.ProductRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get()) }
}