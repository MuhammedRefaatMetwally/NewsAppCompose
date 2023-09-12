package com.example.newsappcompose.ui.screens.settings

import android.os.Bundle
import android.view.animation.OvershootInterpolator
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.newsappcompose.R
import com.example.newsappcompose.ui.navigation_component.NewsScreens
import com.example.newsappcompose.ui.theme.NewsAppComposeTheme
import kotlinx.coroutines.delay

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsAppComposeTheme {


            }
        }

    }
}


@Composable
fun SplashContent(navController: NavHostController) {
    val scale  = remember {
        androidx.compose.animation.core.Animatable(0f)
    }

LaunchedEffect(key1 = true){
    scale.animateTo(
        targetValue = 0.3f,
        animationSpec = tween(
            delayMillis = 500,
            easing = {
                OvershootInterpolator(2f).getInterpolation(it)
            }
        )
    )

    delay(3000L)
    navController.navigate(NewsScreens.CategoriesScreen.name)
}

    Image(
        contentScale = ContentScale.FillBounds,
        painter = painterResource(id = R.drawable.pattern),
        contentDescription = "pattern"
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.fillMaxSize(.65F),
            painter = painterResource(id = R.drawable.splash_logo),
            contentDescription = "splash logo"
        )

    }
}


