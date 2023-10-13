package com.example.newsappcompose.ui.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.newsappcompose.Category
import com.example.newsappcompose.Constants
import com.example.newsappcompose.R
import com.example.newsappcompose.ui.navigation_component.NewsScreens

@Composable
fun CategoriesContent(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.pattern), contentScale = ContentScale.FillBounds)){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 90.dp, end = 18.dp, bottom = 36.dp, start = 18.dp)
        ) {
            Text(
                modifier = Modifier.padding(bottom = 32.dp),
                text = stringResource(R.string.pick_your_category) +
                        stringResource(R.string.of_interest),
                style = TextStyle(
                    color = Color(0XFF4F5A69),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            LazyVerticalStaggeredGrid(
                modifier = Modifier.fillMaxSize(),
                columns = StaggeredGridCells.Fixed(2),
                contentPadding = PaddingValues(24.dp),
                horizontalArrangement = Arrangement.spacedBy(24.dp),
                verticalItemSpacing = 24.dp
            ) {
                items(Constants.categories.size) {
                    val item = Constants.categories[it]
                    CategoryCard(item = item, position = it){
                        navController.navigate(NewsScreens.HomeScreen.name + "/${item.apiID}" + "/${item.titleResID}" )
                        //navController.popBackStack(NewsScreens.HomeScreen.name, inclusive = false)
                    }

                }
            }


        }
    }
}

@Composable
fun CategoryCard(item: Category, position: Int, onClick : () -> Unit) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = item.backgroundColor
        ),
        modifier = Modifier
            .background(
                colorResource(id = item.idColor),
                if (position % 2 == 0) RoundedCornerShape(
                    topStart = 24.dp,
                    topEnd = 24.dp,
                    bottomStart = 24.dp,
                    bottomEnd = 0.dp
                ) else
                    RoundedCornerShape(
                        topStart = 24.dp,
                        topEnd = 24.dp,
                        bottomEnd = 24.dp,
                        bottomStart = 0.dp
                    )
            )
            .fillMaxHeight(.25F)
            .fillMaxWidth(.5F)
            .clickable {
                onClick.invoke()
            }

    ) {
        Column(
            modifier = Modifier
                .width(200.dp)
                .height(150.dp)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth(1F)
                    .fillMaxHeight(.7F),
                painter = painterResource(id = item.drawableResId),
                contentDescription = ""
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                textAlign = TextAlign.Justify,
                text = stringResource(id = item.titleResID),
                style = TextStyle(color = Color.White, fontSize = 24.sp),
            )
        }
    }
}