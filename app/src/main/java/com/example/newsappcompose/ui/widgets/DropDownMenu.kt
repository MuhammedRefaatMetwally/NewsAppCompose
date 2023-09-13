package com.example.newsappcompose.ui.widgets

import android.content.Context
import android.content.ContextWrapper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.intl.Locale
import com.example.newsappcompose.R
import com.example.newsappcompose.ui.localeSelection
import okhttp3.internal.platform.Platform

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownMenuBox() {
    val context = LocalContext.current
    val languages = arrayOf(context.getString(R.string.arabic), context.getString(R.string.english))
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(context.getString(R.string.language)) }

    Box(
        modifier = with (Modifier){
            fillMaxWidth()

        }
    ) {
        ExposedDropdownMenuBox(
            modifier = Modifier.align(Alignment.Center),
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            }
        ) {
            TextField(
                value = selectedText,
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                modifier = Modifier.menuAnchor()
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                languages.forEach { item ->
                    DropdownMenuItem(
                        text = { Text(text = item) },
                        onClick = {
                            selectedText = item
                            expanded = false
                            if (selectedText == context.getString(R.string.english)){
                                selectedText = context.getString(R.string.english)
                                localeSelection(context = context, localeTag = Locale("en").toLanguageTag())
                                Toast.makeText(context,"ENGLISH",Toast.LENGTH_LONG).show()
                            }else{
                                selectedText = context.getString(R.string.arabic)
                                localeSelection(context = context, localeTag = Locale("ar").toLanguageTag())

                                Toast.makeText(context,"Arabic",Toast.LENGTH_LONG).show()
                            }

                        }
                    )
                }
            }
        }
    }
}

fun Context.getActivity(): AppCompatActivity? = when (this) {
    is AppCompatActivity -> this
    is ContextWrapper -> baseContext.getActivity()

    else -> null
}