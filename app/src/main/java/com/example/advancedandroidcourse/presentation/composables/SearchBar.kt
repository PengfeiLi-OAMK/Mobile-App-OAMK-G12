package com.example.advancedandroidcourse.presentation.composables

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun SearchBar(
    iconRes: Int,
    value: String,
    onValueChange: (String) -> Unit,
    onSearchClick: () -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        trailingIcon = {
            IconButton(
                onClick = onSearchClick
            ) {
                Icon(painter = painterResource(id = iconRes), contentDescription = "Search Icon")
            }
        }
    )
}