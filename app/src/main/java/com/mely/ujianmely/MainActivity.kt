package com.mely.ujianmely

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.tooling.preview.Preview
import com.mely.ujianmely.ui.theme.UjianMelyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ganjil() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasSize = size
        val canvasWidth = size.width
        val canvasHeight = size.height
        rotate(degrees = 90F) {
            drawRect(
                color = Color.Yellow,
                topLeft = Offset(x = canvasWidth / 3.3F, y = canvasHeight / 3.7F),
                size = canvasSize / 2F
            )
        }
        drawCircle(
            color = Color.Blue,
            center = Offset(x = canvasWidth / 1.7f, y = canvasHeight / 2F),
            radius = size.minDimension / 4.5f
        )

    }
}