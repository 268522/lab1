package com.example.laby12

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import kotlin.math.absoluteValue

@Composable
fun screen1(navController: NavController) {
    val klik = remember{
        mutableIntStateOf(0)
    }
    Button(onClick = { klik.value++}) {
        Text(text = "Licznik ")
        Text(text = "klikniec: ${klik.value}")
    }
    }