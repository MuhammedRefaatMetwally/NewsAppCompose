package com.example.newsappcompose.ui.widgets

import android.provider.CalendarContract
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)

@Composable
fun SearchBar(
    searchText: String,
    placeholderText: String = "",
    onSearchTextChanged: (String) -> Unit = {},
    onSearchClick: () -> Unit = {},
    onClose: () -> Unit = {}
) {
    var showClearButton by remember { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusRequester = remember { FocusRequester() }

    TopAppBar(modifier = Modifier.fillMaxHeight(.1F).clip(
        RoundedCornerShape(
            topStart = 0.dp,
            topEnd = 0.dp,
            bottomStart = 26.dp,
            bottomEnd = 26.dp
        )
    ), colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
        containerColor = Color(0xFF39A552),
        navigationIconContentColor = Color.White
    ), title = { Text("") },actions = {
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 16.dp)
                .clip(
                    RoundedCornerShape(
                        corner = CornerSize(24.dp)
                    )
                )
                .onFocusChanged { focusState ->
                    showClearButton = (focusState.isFocused)
                }
                .focusRequester(focusRequester),
            value = searchText,
            onValueChange = onSearchTextChanged,
            placeholder = {
                Text(text = placeholderText, style = TextStyle(color = Color.LightGray, fontSize = 18.sp))
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                containerColor = Color.White,
                // cursorColor = LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
            ),
            leadingIcon = {
                IconButton(onClick = { onClose() }) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        modifier = Modifier.size(32.dp),
                        contentDescription = "",
                        tint = Color(0xFF39A552)
                    )
                }
            },
            trailingIcon = {
                AnimatedVisibility(
                    visible = showClearButton,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    IconButton(onClick = { onSearchClick() }) {
                        Icon(
                            modifier = Modifier.size(32.dp),
                            imageVector = Icons.Filled.Search,
                            contentDescription = "close",
                            tint = Color(0xFF39A552)
                        )
                    }

                }
            },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = androidx.compose.ui.text.input.ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                keyboardController?.hide()
            }),
        )


    })


    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }
}
