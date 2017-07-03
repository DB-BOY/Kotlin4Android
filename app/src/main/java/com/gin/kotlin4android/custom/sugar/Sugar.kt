package com.gin.kotlin4android.custom.sugar

import com.gin.kotlin4android.custom.Utils

/**
 * Created by wang.lichen on 2017/6/29.
 *
 * (见识少，轻喷)
 *
 *
 * 还不清楚怎么在log中直接使用函数作为参数输出
 * 但是找到了这种方法，先用，以后更新
 * log("-----${fun()}")
 * 
 */

class Sugar {

    fun log(msg: String) {
        Utils.log(msg)
    }

    fun log(msg: Char) {
        Utils.log("$msg")
    }

    constructor() {

//        x()
        /*String 操作  */
//        str()
//        SugarOperator()
//        SugarStatement()
        SugarFun()
    }


    /**
     * 整数
     */
    fun x() {

//        val num1: Int = 121
        val num1: Int = 128
        val num2: Int? = num1
        val num3: Int? = num1

        log("${num2 == num3}")   //true 比较值是否相等
        log("${num2 === num3}")   //false 比较内存地址是否相等


        val numInt = 1
//      val numLong = numInt  //java  kotlin不支持
        val numLong = numInt.toLong() //kotlin语法
    }

    /**
     * 字符串操作
     */
    fun str() {
        //字符拼接
        var a = 1
        var b = 2.22
        var c = false
        var str = "a=$a,b=$b,c=$c"

        log(str)

        log("length= $str.length")
        log(str[0])

        for (char in str) {
            log(char)
        }
        //换行
        str = """a = $a ,   
        b = $b ,  
        c = $c
        """
        log(str)

    }

}