package com.example.prak5.ui.theme

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

}