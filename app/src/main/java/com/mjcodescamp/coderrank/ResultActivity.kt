package com.mjcodescamp.coderrank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val x = intent.getIntExtra("Wrong",0)
        val y = intent.getIntExtra("Right",0)
        if(y>=0 && x>=0){
            textView5.text = "Total Wrong = $x"
            textView6.text = "Total Right = $y"
        }
        if (y<=7){
            textView7.text = "Status = Poor"
        }
        if (y>7 && y<=13){
            textView7.text = "Status = Good"
        }
        if (y>13 && y<=17){
            textView7.text = "Status = Very Good"
        }
        if (y>17){
            textView7.text = "Status = Excellent"
        }
        var total = (20-(y + x))
        textView8.text = "Not attempt = $total"
    }
}
