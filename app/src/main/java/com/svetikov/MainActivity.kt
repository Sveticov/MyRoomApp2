package com.svetikov

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.svetikov.modelview.PersonView
import com.svetikov.scrin.MainScreen
import com.svetikov.ui.theme.MyRoomAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val model : PersonView by viewModels()
        setContent {
            MyRoomAppTheme {
                // A surface container using the 'background' color from the themegit
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen(model)
                }
            }
        }
    }
}
