package com.mdc.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.PersonAdd
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.mdc.gmailclone.R
import com.mdc.gmailclone.accountList
import com.mdc.gmailclone.getColorForName
import com.mdc.gmailclone.model.Account

@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false }) {
        AccountsDialogUI(modifier = Modifier, openDialog)
    }
}

@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier, openDialog: MutableState<Boolean>) {
    Card(shape = RoundedCornerShape(24.dp)) {
        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp)
                .background(color = Color.White)) {
            Row(modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Box(modifier.weight(1f)) {
                    IconButton(onClick = { openDialog.value = false }) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = "")
                    }
                }
                Image(painter = painterResource(id = R.drawable.google), contentDescription = "", modifier = Modifier.height(24.dp))
                Spacer(modifier = Modifier.weight(1f))
            }
            Column() {
                AccountItem(account = accountList[0])
                Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    Box(modifier = Modifier
                        .requiredWidth(150.dp)
                        .background(color = Color.White)
                        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(8.dp)), contentAlignment = Alignment.Center) {
                        Text(text = "Google Account", modifier.padding(8.dp), textAlign = TextAlign.Center, color = Color.Black)
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }
                Divider(modifier.padding(top = 16.dp))
                AccountItem(account = accountList[1])
                AccountItem(account = accountList[2])
                Row(modifier.padding(top = 16.dp, start = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Icon(modifier = modifier.padding(end = 16.dp), imageVector = Icons.Outlined.PersonAdd, contentDescription = "")
                    Text(text = "Add another account", color = Color.Black)
                }
                Row(modifier.padding(top = 16.dp, start = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Icon(modifier = modifier.padding( end = 16.dp), imageVector = Icons.Outlined.Person, contentDescription = "")
                    Text(text = "Manage accounts on this device", color = Color.Black)
                }
                Divider(modifier.padding(top = 16.dp, bottom = 16.dp))

                Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "Privacy Policy")
                    Box(
                        modifier
                            .width(2.dp)
                            .height(2.dp)
                            .background(color = Color.Gray)) {
                        
                    }
                    Text(text = "Terms Of Service")
                }
            }
        }
    }
}

@Composable
fun AccountItem(account: Account) {
    val color = getColorForName(account.userName)
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 16.dp, top = 16.dp)) {
        if(account.icon !== null) {
            Image(painter = painterResource(id = account.icon), contentDescription = "Profile", modifier = Modifier
                .size(40.dp)
                .clip(
                    CircleShape
                )
                .background(color = Color.Gray), contentScale = ContentScale.Crop)
        }else {
            Box(modifier = Modifier
                .padding(end = 8.dp)
                .size(40.dp)
                .clip(CircleShape)
                .background(color = color), contentAlignment = Alignment.Center) {
                Text(text = account.userName[0].toString(), textAlign = TextAlign.Center, modifier = Modifier.padding(8.dp), color = Color.White)
            }
        }
        Column(
            modifier = Modifier
                .weight(2.0f)
                .padding(start = 16.dp, bottom = 16.dp)) {
            Text(text = account.userName, fontWeight = FontWeight.Bold, color = Color.Black)
            Text(text = account.email)
        }
        if(account.unreadMails > 100) {
            Text(text = "99+", modifier = Modifier
                .padding(end = 16.dp, bottom = 16.dp)
                .align(Alignment.Bottom), fontSize = 14.sp)
        } else {
            Text(text = "${account.unreadMails}+", modifier = Modifier
                .padding(end = 16.dp, bottom = 16.dp)
                .align(Alignment.Bottom), fontSize = 14.sp)
        }

    }
}

@Preview
@Composable
fun AccountsDialogPreview() {
    // AccountsDialogUI()
}