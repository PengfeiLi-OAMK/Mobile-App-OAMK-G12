package com.example.advancedandroidcourse.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun AuthorInfo(
    userAvatar: String,
    userName: String,
    isSaved: Boolean,
    onToggleSaved: () -> Unit
) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = rememberImagePainter(userAvatar),
            contentDescription = "User Avatar",
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = userName, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.weight(1f))

        FavoriteIcon(Modifier, isSaved, onToggleSaved)
    }
}