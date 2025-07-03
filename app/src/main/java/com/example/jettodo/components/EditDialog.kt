package com.example.jettodo.components


import androidx.compose.material.AlertDialog

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun EditDialog() {
    AlertDialog(
        onDismissRequest = { /*TODO*/ },
        title = { Text(text = "タスク新規作成") },
        text = { Text(text = "Edit your task details here") },
        buttons = {},
        // 実機デバッグでは問題無い
        )
}
