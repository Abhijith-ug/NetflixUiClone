package com.example.netflixclone

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.netflixclone.repository.HomeRepository
import com.example.netflixclone.viewmodels.HomeViewModel

//class HomeViewModelProviderFactory(val homeRepository: HomeRepository):ViewModelProvider.Factory {
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return HomeViewModel(homeRepository) as T
//    }
//
//}