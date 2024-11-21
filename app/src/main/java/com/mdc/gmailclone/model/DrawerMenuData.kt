package com.mdc.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.outlined.AllInbox
import androidx.compose.material.icons.outlined.CalendarToday
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Drafts
import androidx.compose.material.icons.outlined.ErrorOutline
import androidx.compose.material.icons.outlined.Help
import androidx.compose.material.icons.outlined.Inbox
import androidx.compose.material.icons.outlined.LabelImportant
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.Outbox
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Report
import androidx.compose.material.icons.outlined.Schedule
import androidx.compose.material.icons.outlined.ScheduleSend
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.ui.graphics.Color
import com.mdc.gmailclone.colorFromHex

sealed class DrawerMenuData(val icon: ImageVector? = null, val title: String? = null, val count: String? = "", val countBgColor: Color? = Color.Transparent,
                            val isDivider: Boolean = false, val isHeader: Boolean = false) {

    object DividerOne: DrawerMenuData(isDivider = true)

    object Primary: DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary",
        count = "99+"
    )

    object Promotions: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "Promotions",
        count = "265 new",
        countBgColor = colorFromHex("#66FF33")
    )

    object Social: DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Social",
        count = "693 new",
        countBgColor = colorFromHex("#FF9933")
    )

    object Updates: DrawerMenuData(
        icon = Icons.Outlined.ErrorOutline,
        title = "Updates",
        count = "60 new",
        countBgColor = colorFromHex("#33FFBD")
    )

    object AllLabels: DrawerMenuData(
        isHeader = true,
        title = "All Labels"
    )

    object Starred: DrawerMenuData(
        icon = Icons.Outlined.StarOutline,
        title = "Starred"
    )

    object Snoozed: DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Snoozed"
    )

    object Important: DrawerMenuData(
        icon = Icons.Outlined.LabelImportant,
        title = "Important",
        count = "284"
    )

    object Sent: DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Sent",
        count = "1"
    )

    object Scheduled: DrawerMenuData(
        icon = Icons.Outlined.ScheduleSend,
        title = "Scheduled"
    )

    object Outbox: DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )

    object Drafts: DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Drafts",
        count = "16"
    )

    object AllMail: DrawerMenuData(
        icon = Icons.Outlined.Mail,
        title = "All mail",
        count = "99+"
    )

    object Spam: DrawerMenuData(
        icon = Icons.Outlined.Report,
        title = "Spam",
        count = "5"
    )

    object Bin: DrawerMenuData(
        icon = Icons.Outlined.Delete,
        title = "Bin"
    )

    object GoogleApps: DrawerMenuData(
        isHeader = true,
        title = "Google apps"
    )

    object Calendar: DrawerMenuData(
        icon = Icons.Outlined.CalendarToday,
        title = "Calendar"
    )

    object Contacts: DrawerMenuData(
        icon = Icons.Outlined.Delete,
        title = "Contacts"
    )

    object DividerTwo: DrawerMenuData(
        isDivider = true
    )

    object Settings: DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )

    object Help: DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help and feedback"
    )

}