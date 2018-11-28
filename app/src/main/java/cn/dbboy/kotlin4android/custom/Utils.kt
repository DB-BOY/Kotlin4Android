package cn.dbboy.kotlin4android.custom

import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 * Created by db.boy on 2017/6/29.
 *
 * 全是静态方法的写法
 * 类名 改为 object 类名 即可
 */
object Utils {
    var TAG = "----Gin"
    fun log(msg: String = " msg") {
        Log.i(TAG, msg
        )
    }

    fun toast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}