package com.example.newsappcompose.ui.screens.settings

import com.example.newsappcompose.ui.widgets.DropdownMenuBox
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsappcompose.R
import com.example.newsappcompose.ui.screens.categoires.NewsAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showSystemUi = true)
fun Settings() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val buttonTextResId by remember { mutableStateOf(R.string.language) }
   Box(modifier = with(Modifier){
       fillMaxSize()
           .paint(painter = painterResource(id = R.drawable.pattern) , contentScale = ContentScale.FillBounds)
   }) {
       Column() {
           NewsAppBar(drawerState =drawerState , title = stringResource(R.string.settingsTab))
           Text(modifier = Modifier.padding(24.dp),text = stringResource(buttonTextResId), style = TextStyle(
               fontSize = 24.sp,
               fontWeight = FontWeight.Bold
           ))

           DropdownMenuBox()
       }
   }
}