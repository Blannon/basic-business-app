package com.blannon_network.basicbusinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.blannon_network.basicbusinesscardapp.ui.theme.BasicBusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicBusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(){
    Column(modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        val image = painterResource(R.drawable.android_logo)

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(1.dp)
                .width(190.dp)
                .height(190.dp)
                .clip(shape = RoundedCornerShape(180.dp))
                .background(
                    color = Color.LightGray
                ),
            alignment = Alignment.Center,
            
            

        )
        Text(
            text = stringResource(R.string.full_name),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.title),
            modifier = Modifier
                .padding(2.dp)
        )

    }

    Column(
        modifier = Modifier
            .padding(top = 500.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Contact()

    }
}

@Composable
fun Contact(){
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(bottom = 3.dp)
        ){
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Home Icon",
                modifier = Modifier
                    .padding(start = 3.dp)
            )
            Text(
                text = "+254 (87) 678 876",
                modifier = Modifier
                    .padding(start = 3.dp)
                )

        }
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(top = 7.dp)
        ){
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "person Icon",
                modifier = Modifier
                    .padding(start = 3.dp)
            )
            Text(
                text = stringResource(R.string.instagram),
                modifier = Modifier
                    .padding(start = 3.dp),
                textAlign = TextAlign.Justify
            )

        }
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(top = 7.dp)
        ){
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email Icon",
                modifier = Modifier
                    .padding(start = 3.dp)
            )
            Text(
                text = stringResource(R.string.email),
                modifier = Modifier
                    .padding(start = 3.dp)
            )

        }



    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardPreview(){
    BasicBusinessCardAppTheme {
        BusinessCard()
    }
}