package com.norm.myscreenwidgetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.norm.myscreenwidgetcompose.ui.theme.MyScreenWidgetComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScreenWidgetComposeTheme {
            }
        }
    }
}