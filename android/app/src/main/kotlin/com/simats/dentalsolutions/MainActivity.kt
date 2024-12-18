package com.simats.dentalsolutions

import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity

class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Clear FLAG_SECURE to allow screenshots and screen recording
        window.clearFlags(android.view.WindowManager.LayoutParams.FLAG_SECURE)
    }
}
