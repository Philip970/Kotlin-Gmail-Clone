package com.mdc.gmailclone
import androidx.compose.ui.graphics.Color

val profileColors = listOf(
    "#FF5733", "#33FF57", "#3357FF", "#FF33A1", "#A133FF", "#33FFF3",
    "#FFBD33", "#33FFBD", "#BD33FF", "#FF3366", "#66FF33", "#3366FF",
    "#FF9933", "#33FF99", "#9933FF", "#FF33C9", "#C933FF", "#33C9FF",
    "#FFC933", "#33FFC9", "#C9FF33", "#FF3366", "#66FF33", "#3366FF"
)

// Function to get color for the first letter of the name
fun getColorForName(name: String): Color {
    if (name.isEmpty()) return colorFromHex("#FFFFFF") // Return white if name is empty
    val firstLetter = name[0].lowercaseChar()
    val index = (firstLetter - 'a') % profileColors.size
    val hex =  profileColors.getOrElse(index) { "#FFFFFF" } // Fallback to white

    return  colorFromHex(hex)
}

fun colorFromHex(hex: String): Color {
    return Color(android.graphics.Color.parseColor(hex))
}