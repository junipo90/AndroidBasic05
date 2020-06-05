package com.example.androidbasic05

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, SubActivity::class.java)
                intent.putExtra("MESSAGE", "MainActivity에서 왔습니다")

                //startActivity(intent) // 다시 반환 받을 값이 없을 때
                startActivityForResult(intent, 1234)
            }

        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == 1234 && resultCode == Activity.RESULT_OK){
            messageText.text = data?.getStringExtra("MESSAGE")
        }
    }
}
