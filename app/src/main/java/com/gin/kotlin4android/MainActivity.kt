package com.gin.kotlin4android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import com.gin.kotlin4android.book.BookActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    /*
    kotlin switch 用when代替
     */
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn1 -> {
                toast("书中练习")
                startActivity(BookActivity.getIntent(this))
            }
        }
    }

    val TAG = "-----gin: "

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = " kotlin 4 Android"
        btn1.text = "书中练习"
        btn1.setOnClickListener(this)
        btn2.text = "自定义练习"
        btn2.setOnClickListener {
            toast("自定义练习")
        }
    }


    fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }

    fun log(msg: String = " message ") {
        Log.i(TAG, msg)
    }

}