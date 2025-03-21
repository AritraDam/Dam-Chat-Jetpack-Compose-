package com.example.damchat.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.damchat.R

@Preview(showSystemUi = true)
@Composable
fun SignInScreen() {
    val brush = Brush.linearGradient(
        listOf(
            Color(0xFF03A9F4),
            Color(0xFF2550CC)
        )
    )
    Image(
        painter = painterResource(id = R.drawable.login_blur),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Spacer(modifier = Modifier.height(80.dp))
        Image(
            painter = painterResource(id = R.drawable.oig4__rndcloiljdx4hxpn),
            contentDescription = null
        )
        Text(
            text = "Dam Chat",
            style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.ExtraBold),
            color = Color(0xFF101010)
        )
        Text(
            text = "This is a chat app, only for learning purpose",
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            color = Color(0xFF101010)
        )
        Spacer(modifier = Modifier.height(70.dp))
        Button(
            onClick = {/*Todo*/ },
            modifier = Modifier
                .background(brush, CircleShape)
                .fillMaxWidth(.7f)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(Color.Transparent)
        ) {
            Text(
                text = "Continue with Google",
                modifier = Modifier.padding(end = 20.dp),
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )
            Image(
                painter = painterResource(R.drawable.goog_0ed88f7c),
                contentDescription = null,
                modifier = Modifier.scale(1.2f)
            )
        }
    }
}