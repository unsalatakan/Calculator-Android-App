package com.atakan.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.atakan.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    private var ilkSayi: Int = 0
    private var ikinciSayi: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.button0.setOnClickListener {
            if (tasarim.textView.text.toString() == "0") {
                tasarim.textView.text = "0"
            } else {
                tasarim.textView.text = tasarim.textView.text.toString() + "0"
            }
        }

        tasarim.button1.setOnClickListener {
            if (tasarim.textView.text.toString() == "0") {
                tasarim.textView.text = "1"
            } else {
                tasarim.textView.text = tasarim.textView.text.toString() + "1"
            }
        }

        tasarim.button2.setOnClickListener {
            if (tasarim.textView.text.toString() == "0") {
                tasarim.textView.text = "2"
            } else {
                tasarim.textView.text = tasarim.textView.text.toString() + "2"
            }
        }

        tasarim.button3.setOnClickListener {
            if (tasarim.textView.text.toString() == "0") {
                tasarim.textView.text = "3"
            } else {
                tasarim.textView.text = tasarim.textView.text.toString() + "3"
            }
        }

        tasarim.button4.setOnClickListener {
            if (tasarim.textView.text.toString() == "0") {
                tasarim.textView.text = "4"
            } else {
                tasarim.textView.text = tasarim.textView.text.toString() + "4"
            }
        }

        tasarim.button5.setOnClickListener {
            if (tasarim.textView.text.toString() == "0") {
                tasarim.textView.text = "5"
            } else {
                tasarim.textView.text = tasarim.textView.text.toString() + "5"
            }
        }

        tasarim.button6.setOnClickListener {
            if (tasarim.textView.text.toString() == "0") {
                tasarim.textView.text = "6"
            } else {
                tasarim.textView.text = tasarim.textView.text.toString() + "6"
            }
        }

        tasarim.button7.setOnClickListener {
            if (tasarim.textView.text.toString() == "0") {
                tasarim.textView.text = "7"
            } else {
                tasarim.textView.text = tasarim.textView.text.toString() + "7"
            }
        }

        tasarim.button8.setOnClickListener {
            if (tasarim.textView.text.toString() == "0") {
                tasarim.textView.text = "8"
            } else {
                tasarim.textView.text = tasarim.textView.text.toString() + "8"
            }
        }

        tasarim.button9.setOnClickListener {
            if (tasarim.textView.text.toString() == "0") {
                tasarim.textView.text = "9"
            } else {
                tasarim.textView.text = tasarim.textView.text.toString() + "9"
            }
        }

        tasarim.buttonAC.setOnClickListener {

            tasarim.textView.text = "0"
            ilkSayi = 0
            ikinciSayi = 0
        }

        tasarim.buttonplus.setOnClickListener {

            ilkSayi = tasarim.textView.text.toString().toInt()

            if (ikinciSayi != 0) {
                ikinciSayi = 0
            }

            tasarim.textView.text = "0"
        }

        tasarim.buttonequal.setOnClickListener {
            if (ilkSayi != 0 && ikinciSayi != 0) {
                tasarim.textView.text =
                    (tasarim.textView.text.toString().toInt() + ikinciSayi).toString()
            } else {
                ikinciSayi = tasarim.textView.text.toString().toInt()
                tasarim.textView.text = (ilkSayi + ikinciSayi).toString()
            }
        }
    }
}