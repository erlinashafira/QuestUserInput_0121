package com.example.prak5.ui.theme

import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember (mutableStateOf(value = "") }
    var textJK by remember (mutableStateOf(value = "") }
    val gender:List<String> = listOf("Laki-laki","Perempuan")

    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAllignment = Allingment.CenterHorizontally) {
    OutlinedTextField(
        value = textNama,
        SingleLine = true,
        shape = MaterialTheme.shapes.large,
        modifier = Modifier.width(250.dp),
        label = { Text(text = "Nama Lengkap") },
        onValueChange = {
            textNama = it
        }
    )

    Row {

}

}