package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color.DarkGray),
        verticalArrangement = Arrangement.Center,
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image (
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.height(80.dp).width(80.dp),
            )
            Text(
                text = "Jennifer Doe",
                fontSize = 36.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 4.dp),
                color = Color.White,
            )
            Text(
                text = "Jennifer Developer Extraordinaire",
                fontSize = 16.sp,
                 color = Color.Green,
                modifier = Modifier
                    .padding(vertical = 4.dp),
                fontWeight = FontWeight.Bold,
            )
        }
        Column(modifier = Modifier.padding(top = 200.dp)) {
            Divider(
                thickness = 1.dp,
                color = Color.White,
            )
            Row(modifier = Modifier.padding(vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                Spacer(modifier = Modifier.width(36.dp))
                Icon(
                    imageVector = Icons.Rounded.Phone,
                    contentDescription = null,
                    tint = Color.Green,
                )
                Spacer(modifier = Modifier.width(24.dp))
                Text(
                    text = "+11 (123) 444 555 666",
                    color = Color.White,
                )
            }
            Divider(
                thickness = 1.dp,
                color = Color.White,
            )
            Row(modifier = Modifier.padding(vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                Spacer(modifier = Modifier.width(36.dp))
                Icon(
                    imageVector = Icons.Rounded.Share,
                    contentDescription = null,
                    tint = Color.Green,
                )
                Spacer(modifier = Modifier.width(24.dp))
                Text(
                    text = "@AndroidDev",
                    color = Color.White,
                )
            }
            Divider(
                thickness = 1.dp,
                color = Color.White,
            )
            Row(modifier = Modifier.padding(vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                Spacer(modifier = Modifier.width(36.dp))
                Icon(
                    imageVector = Icons.Rounded.Email,
                    contentDescription = null,
                    tint = Color.Green,
                )
                Spacer(modifier = Modifier.width(24.dp))
                Text(
                    text = "jen.doe@android.com",
                    color = Color.White,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Greeting("Android")
    }
}