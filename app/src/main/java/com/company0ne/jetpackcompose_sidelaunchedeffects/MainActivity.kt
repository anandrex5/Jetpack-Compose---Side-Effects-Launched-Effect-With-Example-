package com.company0ne.jetpackcompose_sidelaunchedeffects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Counter()
        }
    }
}
@Composable
fun Counter(){
    var count = remember{ mutableStateOf(0) }
    var key = count.value %3 ==0
    LaunchedEffect(key1 = key) {
        Log.d("Counter", "Current count: ${count.value}")
    }
    Button(onClick = {count.value++}) {
        Text(text = "Increment count")
        
    }
}