package com.intellif.composefacedevice.di

import com.intellif.composefacedevice.vm.LoadingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    single { LoadingViewModel() }
}
val remoteModule = module {


}

val appModule = listOf(viewModelModule, remoteModule)