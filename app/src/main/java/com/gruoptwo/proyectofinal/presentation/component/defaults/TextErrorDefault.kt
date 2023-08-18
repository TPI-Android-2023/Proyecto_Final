package com.vorue.listgame.presentation.component.defaults

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextErrorDefault(errorMsg: String) {

    Text(
        modifier = Modifier.padding(top = 5.dp),
        text = errorMsg,
        fontSize = 11.sp,
        color = MaterialTheme.colorScheme.error
    )
}