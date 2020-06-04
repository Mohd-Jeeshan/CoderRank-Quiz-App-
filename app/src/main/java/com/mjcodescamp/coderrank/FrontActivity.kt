package com.mjcodescamp.coderrank

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_front.*

class FrontActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front)

        click1.setOnClickListener {
            val obj = Intent(applicationContext, Click1Activity::class.java)
            startActivity(obj)
        }
        click2.setOnClickListener {
            val obj = Intent(applicationContext, Click2Activity::class.java)
            startActivity(obj)
        }
        click3.setOnClickListener {
            val obj = Intent(applicationContext, Click3Activity::class.java)
            startActivity(obj)
        }
        click4.setOnClickListener {
            val obj = Intent(applicationContext, Click4Activity::class.java)
            startActivity(obj)
        }

        source.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val obj = Intent(Intent.ACTION_VIEW)
                try {
                    obj.setData(Uri.parse("https://github.com/Mohd-Jeeshan/CoderRank-Quiz-App-.git"))
                    startActivity(obj)
                }catch (e:Exception){
                    Toast.makeText(applicationContext,"Please Install Google Chrome",Toast.LENGTH_SHORT).show()
                }
            }
        })

        sliderView.adapter = ViewPagerAdapter(this)
    }

    override fun onBackPressed() {
        val X = AlertDialog.Builder(this)
        X.setTitle("Codes Rank")
        X.setMessage("You want to close this App")
        X.setIcon(R.mipmap.ic_launcher_round)
        X.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int -> } )
        X.setPositiveButton("Yes",{ dialogInterface: DialogInterface, i: Int -> finish()  } )
        X.show()
    }


}
