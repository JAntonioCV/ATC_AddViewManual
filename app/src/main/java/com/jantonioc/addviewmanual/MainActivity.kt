package com.jantonioc.addviewmanual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Agarramos el layout
        val myLayout = findViewById<View>(R.id.testmainLayout) as LinearLayout
        //Agarramos el boton
        val myButton = Button(this)

        myButton.layoutParams= LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)

        myButton.text = "My Button"

        myLayout.addView(myButton)
    }
}