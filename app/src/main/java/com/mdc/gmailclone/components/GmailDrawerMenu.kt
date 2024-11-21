package com.mdc.gmailclone.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mdc.gmailclone.model.DrawerMenuData

@Composable
fun GmailDrawerMenu(scrollState: ScrollState) {
    val menuList = listOf(
        DrawerMenuData.DividerOne,
        DrawerMenuData.Primary,
        DrawerMenuData.Promotions,
        DrawerMenuData.Social,
        DrawerMenuData.Updates,
        DrawerMenuData.AllLabels,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Scheduled,
        DrawerMenuData.Outbox,
        DrawerMenuData.Drafts,
        DrawerMenuData.AllMail,
        DrawerMenuData.Spam,
        DrawerMenuData.Bin,
        DrawerMenuData.GoogleApps,
        DrawerMenuData.Calendar,
        DrawerMenuData.Contacts,
        DrawerMenuData.DividerTwo,
        DrawerMenuData.Settings,
        DrawerMenuData.Help,
    )
    Column(Modifier.verticalScroll(scrollState)) {
        Text(text = "Gmail", color = Color.Red, fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 20.dp, top = 20.dp))
        menuList.forEach { item -> when {
            item.isDivider -> {
                Divider(modifier = Modifier.padding( top = 16.dp))
            }
            item.isHeader -> {
                Text(text = item.title!!, fontWeight = FontWeight.Light, modifier = Modifier.padding(start = 16.dp, top = 16.dp))
            } else -> {
                MailDrawerItem(item = item)
            }
        } }
    }
}


@Composable
fun MailDrawerItem(item: DrawerMenuData) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp)
        .padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(imageVector = item.icon!!, contentDescription = item.title!!, modifier = Modifier.padding(start = 16.dp, end = 16.dp))
        Text(text = item.title, modifier = Modifier.weight(2.0f))

        if(item.count != null) {
            Box(modifier = Modifier.padding(end = 16.dp).clip(shape = RoundedCornerShape(16.dp)) ) {
                Text(text = item.count, modifier = Modifier.background(color = item.countBgColor!!).padding(start = 8.dp, end = 8.dp, bottom = 4.dp, top = 4.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GmailDrawerMenuPreview() {
    // GmailDrawerMenu()
}