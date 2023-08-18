package com.vorue.listgame.presentation.component.defaults

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun ButtonDefault(
    text: String,
    icon: ImageVector?,
    onClick: () -> Unit,
    errorMsg: String = "",
    enabled : Boolean = true
) {


    Column() {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            shape = RoundedCornerShape(2.dp),
            enabled = enabled,
            onClick = { onClick() }) {
            Text(text = text)
            Spacer(modifier = Modifier.width(10.dp))
            if (icon != null) {
                Icon(imageVector = icon, contentDescription = "Arrow Forward")
            }
        }
        TextErrorDefault(errorMsg = errorMsg)

    }

}