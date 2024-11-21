package com.mdc.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mdc.gmailclone.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeAppBar(drawerState: DrawerState, scope: CoroutineScope, openDialog: MutableState<Boolean>) {
    Box(modifier = Modifier.padding(10.dp)) {
        Card(modifier = Modifier.requiredHeight(50.dp), shape = RoundedCornerShape(10.dp), elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)) {
        IconButton(onClick = {
            scope.launch {
                drawerState.open()
            }
        }) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
        }
        Text(text = "Search in emails", modifier = Modifier
            .weight(2.0f)
            .padding(start = 8.dp))
        Image(painter = painterResource(id = R.drawable.eren), contentDescription = "Profile", modifier = Modifier
            .size(30.dp)
            .clip(
                CircleShape
            )
            .clickable {
                openDialog.value = true
            }
            .background(color = Color.Gray), contentScale = ContentScale.Crop)
        
        if(openDialog.value) {
            AccountsDialog(openDialog = openDialog)
        }

    }
        }
    }
}
/*
@Preview
@Composable
fun DefaultPreview() {
    HomeAppBar()
}
 */