package cn.dbboy.kotlin4android.custom

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gin.kotlin4android.R
import cn.dbboy.kotlin4android.custom.sugar.Sugar

class SugarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sugar)

        Sugar()
    }
}
