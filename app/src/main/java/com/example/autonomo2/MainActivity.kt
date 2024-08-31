package com.example.autonomo2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.TextField
import com.example.autonomo2.ui.theme.Autonomo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Autonomo2Theme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    SurveyForm()
                }
            }
        }
    }
}

@Composable
fun SurveyForm() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Formulario de Encuesta")

        Spacer(modifier = Modifier.height(16.dp))

        // primera pregunta
        Text(text = "¿que edad tiene?")
        TextField(value = "", onValueChange = {})

        Spacer(modifier = Modifier.height(16.dp))

        // segunda pregunta
        Text(text = "¿Prefiere el dia o la noche?")
        TextField(value = "", onValueChange = {})

        Spacer(modifier = Modifier.height(16.dp))

        // aqui se encuentra el Botón para enviar encuesta
        Button(onClick = {
            // el val para que pueda Navegar a la segunda actividad
            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
        }) {
            Text("Enviar Encuesta")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Autonomo2Theme {
        SurveyForm()
    }
}
