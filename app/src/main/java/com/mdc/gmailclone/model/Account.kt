package com.mdc.gmailclone.model


data class Account (
    val icon: Int? = null,
    val userName: String,
    val email: String,
    val unreadMails: Int,
)