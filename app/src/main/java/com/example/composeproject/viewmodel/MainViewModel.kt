package com.example.composeproject.viewmodel

import androidx.lifecycle.ViewModel
import com.example.composeproject.repository.EpidemicNewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    repository: EpidemicNewsRepository
) : ViewModel() {
        val result = repository.getEpidemicNews()
}