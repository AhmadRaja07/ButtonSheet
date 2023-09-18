package com.example.buttonsheet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnshow = findViewById<Button>(R.id.btnShow)
            btnshow.setOnClickListener {
                val view= layoutInflater.inflate(R.layout.item_button_sheet,null,false)
                val dialog= BottomSheetDialog(this)
                    dialog.setContentView(view)
                    dialog.show()
            }

    }
}