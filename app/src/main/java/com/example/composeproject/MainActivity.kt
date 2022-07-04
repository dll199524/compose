package com.example.composeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composeproject.ui.theme.GoodNewsTheme
import com.example.composeproject.utils.showToast
import com.example.composeproject.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

const val TAG = "MainActiviy"

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoodNewsTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    initData()
                    MainScreen()
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

@Composable
private fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        modifier = Modifier.fillMaxSize(),
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colors.onSecondary
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { "Person".showToast() }) {
                        Icon(imageVector = Icons.Filled.Person, contentDescription = "Person")
                    }
                },
                actions = {
                    IconButton(onClick = { "Settings".showToast() }) {
                        Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings")
                    }
                }
            )
        }
    ) {
        
    }
}