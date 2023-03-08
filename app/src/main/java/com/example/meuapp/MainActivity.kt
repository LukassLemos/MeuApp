package com.example.meuapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.meuapp.ui.theme.MeuAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        TítulodoAplicativo()
                        Saudação("E.P.I´S")
                        Text(text = "Projeto criado em Android Studio")
                    }
                }
            }
        }
    }

    @Composable
    fun Saudação(name: String) {
        Text(text = "Controle de $name!")
    }

    @Composable
    fun TítulodoAplicativo() {
        Text(text = "Gerenciador de E.P.I`s")
    }

    @Composable
    fun Rodapé() {
        Text(text = "Controle de E.P.I´s com eficiência")
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun DefaultPreview() {
        MeuAppTheme {
            Column() {
                TítulodoAplicativo()
                Saudação("E.P.I´S")
                Text(text = "Projeto criado em Android Studioo")

            }
        }
    }
}
