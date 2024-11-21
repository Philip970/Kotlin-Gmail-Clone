package com.mdc.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.mdc.gmailclone.model.BottomMenuData

@Composable
fun HomeBottomMenu() {
    val items = listOf(BottomMenuData.Mail, BottomMenuData.Meet)

}

@Preview
@Composable
fun HomeBottomMenuPreview() {
    HomeBottomMenu()
}