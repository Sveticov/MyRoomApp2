package com.svetikov.scrin

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.svetikov.model.Person

import com.svetikov.modelview.PersonView
import com.svetikov.ui.theme.ColorBackground
import com.svetikov.ui.theme.ColorTopBar
import com.svetikov.ui.theme.MyRoomAppTheme

@Composable
fun MainScreen(model: PersonView) {
    var name by remember {
        mutableStateOf("")
    }
    var age by remember {
        mutableStateOf("")
    }

    var personLocal by remember {
        mutableStateOf(Person())
    }
    Scaffold(
        backgroundColor = ColorBackground,
        topBar = {
            TopAppBar(

                modifier = Modifier
                    .fillMaxWidth()
                    .background(ColorTopBar),
                backgroundColor = ColorTopBar,
                elevation = 5.dp

            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(5.dp)
                            .clickable {
                                //TODO gdfgf
                            }
                    )
                    Text(
                        "My Room App",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                    Icon(imageVector = Icons.Default.Search,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(5.dp)
                            .clickable {
                                //TODO gdfgf
                            })
                }
            }
        }

    ) {
        Column(
            // verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 8.dp)
        ) {

            Text(text = "Add New Model", fontSize = 22.sp, color = Color.White)
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text(text = "Name") },
                isError = name.isEmpty()
            )
            OutlinedTextField(
                value = age,
                onValueChange = { age = it },
                label = { Text(text = "Age") },
                isError = age.isEmpty()
            )
            OutlinedButton(
                onClick = {
                model.addPerson(name, age)
                    personLocal = model.person
                          },
                modifier = Modifier.padding(top = 5.dp),
                enabled = name.isNotEmpty() && age.isNotEmpty()

            ) {
                Text(text = "Send Model")
            }

            Text(text = personLocal.toString())

        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun PrewMainScreen() {
//    MyRoomAppTheme {
//        MainScreen()
//    }
//}