package com.mjcodescamp.coderrank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_click1.*
import kotlinx.android.synthetic.main.activity_front.*

class Click2Activity : AppCompatActivity() {
    lateinit var timer:CountDownTimer
    var lefttime:Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var right:Int = 0
        var wrong:Int = 0
        setContentView(R.layout.activity_click2)

        timer = object : CountDownTimer(600000,1000) {
            override fun onFinish() {
                val obj = Intent(applicationContext,ResultActivity::class.java)
                obj.putExtra("Wrong",wrong)
                obj.putExtra("Right",right)
                startActivity(obj)
                Toast.makeText(applicationContext,"Your quiz have submitted",Toast.LENGTH_SHORT).show()
            }

            override fun onTick(millisUntilFinished: Long) {
                lefttime = millisUntilFinished
                updateTime()
            }
        }.start()

        radioG1.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB3.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB1.isChecked || radioB2.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG2.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB5.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB4.isChecked || radioB6.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG3.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB8.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB7.isChecked || radioB9.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG4.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB10.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB11.isChecked || radioB12.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG5.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB13.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB14.isChecked || radioB15.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG6.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB16.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB17.isChecked || radioB18.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG7.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB19.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB20.isChecked || radioB21.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG8.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB24.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB22.isChecked || radioB23.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG9.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB25.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB26.isChecked || radioB27.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG10.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB28.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB29.isChecked || radioB30.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG11.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB32.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB31.isChecked || radioB33.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG12.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB34.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB35.isChecked || radioB36.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG13.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB39.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB37.isChecked || radioB38.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG14.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB40.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB41.isChecked || radioB42.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG15.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB44.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB43.isChecked || radioB45.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG16.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB46.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB47.isChecked || radioB48.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG17.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB51.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB49.isChecked || radioB50.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG18.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB52.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB53.isChecked || radioB54.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG19.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB55.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB56.isChecked || radioB57.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })
        radioG20.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            var x = 0
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                if (radioB59.isChecked && x==0){
                    x = checkedId
                    right++
                }
                if ((radioB58.isChecked || radioB60.isChecked) && x==0){
                    wrong++
                    x = checkedId
                }
            }
        })

        btnSubmit.setOnClickListener{
            val obj = Intent(applicationContext,ResultActivity::class.java)
            obj.putExtra("Wrong",wrong)
            obj.putExtra("Right",right)
            timer.cancel()
            startActivity(obj)
        }
    }
    private fun updateTime() {
        var min = lefttime / 60000
        var sec = lefttime % 60000 /1000
        textTimer.text = "$min:$sec"
    }
    override fun onBackPressed() {
        super.onBackPressed()
        timer.cancel()
    }
}

