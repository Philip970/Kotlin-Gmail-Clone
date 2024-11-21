package com.mdc.gmailclone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mdc.gmailclone.components.GmailDrawerMenu
import com.mdc.gmailclone.components.GmailFab
import com.mdc.gmailclone.components.HomeAppBar
import com.mdc.gmailclone.components.MailList
import com.mdc.gmailclone.ui.theme.GmailCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GmailApp() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val openDialog = remember {
        mutableStateOf(false)
    }

    ModalNavigationDrawer(drawerState = drawerState, drawerContent = { ModalDrawerSheet() {
        GmailDrawerMenu(scrollState)
    } }) {
        Scaffold(topBar = { HomeAppBar(drawerState, coroutineScope, openDialog) }, bottomBar = {

        },
            floatingActionButton = { GmailFab(scrollState) }
        ) {
                it -> MailList(paddingValues = it, scrollState)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GmailCloneTheme {
        ProfilePage()
    }
}