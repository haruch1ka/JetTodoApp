package com.example.jettodo.components


import androidx.compose.foundation.layout.*
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EditDialog(isShowDialog: MutableState<Boolean>) {
    AlertDialog(
        onDismissRequest = {
            isShowDialog.value = false // ダイアログを閉じる
        },
        //メインタイトル
        title = { Text(text = "タスク新規作成") },
        //メインコンテンツ
        text = {
            Column() {
                Text(text = "タイトル")
                TextField(value = "", onValueChange = {/*TODO*/ },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text(text = "タスクのタイトル") }
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "詳細")
                TextField(value = "", onValueChange = {/*TODO*/ },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text(text = "タスクの詳細") }
                )
            }
        },
        //ボタン
        buttons = {
            Row(
                modifier = Modifier.padding(8.dp),
                horizontalArrangement = Arrangement.Center,
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    modifier = Modifier.width(120.dp),
                    onClick = {
                        isShowDialog.value = false // ダイアログを閉じる
                    }
                ) {
                    Text(text = "キャンセル")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(
                    modifier = Modifier.width(120.dp),
                    onClick = {
                        isShowDialog.value = false // ダイアログを閉じる
                        /* TODO: タスクの保存処理を実装 */
                    }
                ) {
                    Text(text = "OK")
                }
            }
        },
        // 実機デバッグでは問題無い
    )
}
