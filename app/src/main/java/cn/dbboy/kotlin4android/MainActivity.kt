package cn.dbboy.kotlin4android

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import cn.dbboy.kotlin4android.custom.SugarActivity
import cn.dbboy.kotlin4android.custom.Utils
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

    val TAG = Utils.TAG

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = " kotlin 4 Android"
        btn1.text = "书中练习"
        btn1.setOnClickListener(this)
        btn2.text = "Sugar练习"
        btn2.setOnClickListener {
            toast(btn2.text.toString())
            startActivity(Intent(this, SugarActivity::class.java))
        }
    }


    fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }

    fun log(msg: String = " message ") {
        Log.i(TAG, msg)
    }

}