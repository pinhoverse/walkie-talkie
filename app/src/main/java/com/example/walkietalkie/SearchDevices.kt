package com.example.walkietalkie

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class SearchDevices : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent {
            SearchDeviceScreen()
        }
    }
}

@Composable
fun SearchDeviceScreen(){
    Scaffold  (
        topBar = {TopAppBar(
            title = {Text("Search Device Screen")}
        )}

    ){
      innerPadding ->  Text(text = "Search Devices Screen", modifier = Modifier.padding(innerPadding),

            )
    }
}
