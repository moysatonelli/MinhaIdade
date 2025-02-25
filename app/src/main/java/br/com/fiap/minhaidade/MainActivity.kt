package br.com.fiap.minhaidade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.minhaidade.ui.theme.MinhaIdadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinhaIdadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MeuComponente()
                }
            }
        }
    }
}

@Composable
fun MeuComponente() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        ) {
        Text(
            text = "Qual sua idade?",
            color = Color.Red,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            //modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Prescione os botõões para informar sua idade.",
            fontSize = 12.sp,
            color = Color.Blue,
            textAlign = TextAlign.Center,
            //modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(25.dp))
        Text(
            text = "25",
            fontSize = 48.sp,
            color = Color.Red,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(25.dp))
        Row (horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()){
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(84.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF487A60)),
                shape = RectangleShape
            ) {
                Text(text = "-")
            }
            Spacer(modifier = Modifier.width(50.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(84.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2A6599)),
                shape = RectangleShape
            ) {
                Text(text = "+")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MeuComponentePreview() {
    MinhaIdadeTheme {
        MeuComponente()
    }
}