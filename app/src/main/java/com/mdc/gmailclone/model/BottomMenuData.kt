package com.mdc.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector, title: String
) {
    object Mail: BottomMenuData(icon = Icons.Outlined.Mail, title = "Mail")
    object Meet: BottomMenuData(icon = Icons.Outlined.VideoCall, title = "Meet")
}