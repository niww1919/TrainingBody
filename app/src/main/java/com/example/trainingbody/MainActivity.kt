package com.example.trainingbody

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main
        val textView = TextView(this)
        textView.text = "Work it"
        val ll = LinearLayout(this)
        ll.addView(textView)
        setContentView(ll)
    }


}
