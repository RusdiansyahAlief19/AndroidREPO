package com.example.profilapp_245150207111073_rusdiansyahaliefprasetya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profilapp_245150207111073_rusdiansyahaliefprasetya.ui.theme.ProfilApp_245150207111073_RusdiansyahAliefPrasetyaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilApp_245150207111073_RusdiansyahAliefPrasetyaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    var isFollowed by remember { mutableStateOf(true) }


    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFFE2E8F0))
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.profil),
                contentDescription = "Foto Profil",
                modifier = Modifier
                    .size(160.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Rusdiansyah Alief Prasetya")

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "245150207111073")

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Mahasiswa Teknik Informatika")

            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { isFollowed = !isFollowed }) {
                Text(text = if (isFollowed) "Follow" else "Unfollow")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    ProfilApp_245150207111073_RusdiansyahAliefPrasetyaTheme {
        ProfileScreen()
    }
}