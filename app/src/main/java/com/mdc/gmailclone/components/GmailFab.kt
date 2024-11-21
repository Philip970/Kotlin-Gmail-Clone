package com.mdc.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun GmailFab(scrollState: ScrollState) {
    if(scrollState.value > 100) {
        ExtendedFloatingActionButton(
            text = { Text(text = "Compose", fontSize = 16.sp) },
            icon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "") },
            onClick = { /*TODO*/ }, Modifier.background(color = MaterialTheme.colorScheme.surface))
    } else {
        FloatingActionButton(onClick = { /*TODO*/ }, Modifier.background(color = MaterialTheme.colorScheme.surface)) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "")
        }
    }

}