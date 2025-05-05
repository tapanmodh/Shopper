package com.tm.shopper.di

import androidx.lifecycle.viewmodel.compose.viewModel
import com.tm.shopper.ui.feature.home.HomeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        HomeViewModel(get())
    }
}