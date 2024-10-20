package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.ui.theme.CarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteDeVisiteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                      ){
                    BusinessCard(
                        modifier = Modifier.padding(),

                    )
                }

            }
        }
    }
}



@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileImage()
        Spacer(modifier = Modifier.height(16.dp))
        ProfileInfo()
        Spacer(modifier = Modifier.height(24.dp))
        ContactInfo()
        Spacer(modifier = Modifier.height(24.dp))

    }
}

@Composable
fun ContactInfo() {

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
             .padding(16.dp)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Phone number",
                tint = Color.Black,
                modifier = Modifier
                    .size(24.dp)
                    .align(alignment = Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "+00 (00) 000 000" )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier
                .width(8.dp)
                .fillMaxWidth())
            Text(text = "email@domain.com"
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Social media handle",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "@djoman_henry")
        }
    }

}


@Composable
fun ProfileImage() {
    Image(
        painter = painterResource(R.drawable.android_logo),
        contentDescription = null,
        modifier = Modifier
            .size(100.dp)
            .border(2.dp, Color.Gray),
    )
}


@Composable
fun ProfileInfo() {
    Column {
        Text(
            text = "Djoman Henry",
            fontSize = 24.sp,
            color = Color(0xFF3ddc84),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "Etudiant",
            fontSize = 16.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileImagePreview() {
    CarteDeVisiteTheme {
        BusinessCard()
    }
}