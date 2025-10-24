package com.example.myapplication.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp


@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxsize()
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

    }
}