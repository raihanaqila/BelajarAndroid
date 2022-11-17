package com.example.belajarandroid.ui

import android.annotation.SuppressLint
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.belajarandroid.model.Article

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NewsApp(listArticle: List<Article>) {

//    Scaffold(topBar = {
 //       TopAppBar() {
 //           Icon(Icons.Rounded.Menu, contentDescription = "Icon Home")
 //           Spacer(modifier = Modifier.width(8.dp))
//
 //       }
 //   })

    LazyColumn {
        items(listArticle) { article: Article ->
            NewsCard(article = article)
        }
    }
}

@Composable
fun NewsCard(article: Article) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column() {
            AsyncImage(
                model = article.urlToImage,
                contentDescription = "news image",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = article.title,
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.
            )
        }
    }
}