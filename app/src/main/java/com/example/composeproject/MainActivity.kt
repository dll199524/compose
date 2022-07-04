package com.example.composeproject

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composeproject.repository.EpidemicNewsRepository
import com.example.composeproject.ui.theme.ComposeProjectTheme
import com.example.composeproject.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

const val TAG = "MainActiviy"

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    initData()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun initData(viewModel: MainViewModel = viewModel()) {
    val dataState = viewModel.result.observeAsState()

    dataState.value?.let {
        val orNull = it.getOrNull()
        if (orNull != null) Greeting(name = orNull.msg)
    }
}