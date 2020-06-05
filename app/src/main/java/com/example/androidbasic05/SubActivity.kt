package com.example.androidbasic05

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val intent = intent
        extraText.text = intent.getStringExtra("MESSAGE")

        okButton.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent()
                intent.putExtra("MESSAGE", "다시 돌아왔습니다")

                setResult(Activity.RESULT_OK, intent)

                finish()
            }
        })

    }
}
