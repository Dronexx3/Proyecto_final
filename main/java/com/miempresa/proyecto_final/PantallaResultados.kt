package com.miempresa.proyecto_final

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun PantallaResultados(navController: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF88FFFF))) {
        Column(modifier = Modifier
            .align(Alignment.Center)
            .padding(0.dp)
            .fillMaxWidth()) {
            Card(modifier = Modifier
                .padding(15.dp)
                .fillMaxSize(),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                    contentColor = Color.White),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.outlinedCardElevation(defaultElevation = 20.dp)
            ) {
                Column(modifier = Modifier
                    .padding(16.dp)
                    .background(Color.White)){
                    BotonResultados()
                    Spacer(modifier = Modifier.padding(40.dp))
                    MensajeResultados()
                    Spacer(modifier = Modifier.padding(30.dp))
                    Aciertos()
                    Spacer(modifier = Modifier.padding(20.dp))
                    Fallos()
                    Spacer(modifier = Modifier.padding(20.dp))
                    Porcentaje()
                    Spacer(modifier = Modifier.padding(10.dp))
                    BotonVolver(navController)
                }
            }

        }
    }
}

@Composable
fun BotonResultados(){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.Center
    ){
        Button(onClick = { },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF24A0FF))) {
            Text(text = "Mostrar Resultados",
                fontSize = 25.sp,
                color = Color.Black
            )
        }
    }
}

@Composable
fun MensajeResultados() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center) {
        Text(
            "Resultados:",
            color = Color.Black,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Aciertos(){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center) {
        Text("Aciertos: 4",
            color = Color(0xFF47FF66),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Fallos(){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center) {
        Text("Fallos: 6",
            color = Color(0xFFFF4747),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Porcentaje(){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center) {
        Text("Porcentaje de Aciertos: 40%",
            color = Color(0xFF8F8C00),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun BotonVolver(navController: NavHostController){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.Center
    ){
        Button(onClick = { navController.navigate(Routes.StartScreen.route) },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA4FF24))) {
            Text(text = "Intentar De Nuevo",
                fontSize = 25.sp,
                color = Color.Black
            )
        }
    }
}