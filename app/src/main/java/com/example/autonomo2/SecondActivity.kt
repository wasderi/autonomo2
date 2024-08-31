package com.example.autonomo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.autonomo2.ui.theme.Autonomo2Theme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Autonomo2Theme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    ThankYouScreen()
                }
            }
        }
    }
}

@Composable
fun ThankYouScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "¡Gracias por completar la encuesta!")

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Tu opinión es muy importante para nosotros.")
    }
}

@Preview(showBackground = true)
@Composable
fun ThankYouPreview() {
    Autonomo2Theme {
        ThankYouScreen()
    }
}
