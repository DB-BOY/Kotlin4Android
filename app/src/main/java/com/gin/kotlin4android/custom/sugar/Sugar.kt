package com.gin.kotlin4android.custom.sugar

import com.gin.kotlin4android.custom.Utils

/**
 * Created by wang.lichen on 2017/6/29.
 */

class Sugar {

    fun log(msg: String) {
        Utils.log(msg)
    }

    fun log(msg: Char) {
        Utils.log("$msg")
    }

    constructor() {

        x()
        /*String 操作  */
        str()
        operator()
        statement()
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

    /**
     * 更多运算符
     * http://kotlinlang.org/docs/reference/operator-overloading.html
     *
     * <table>
     *  <tr><td>Expression</td>	<td>Translated to</td> </tr>
     *  <tr>
     *  <td>a + b</td>	    <td>a.plus(b) </td>
     * </tr>
     * <tr>
     * <td>a - b</td>	    <td>a.minus(b) </td>
     * </tr>
     * <tr>
     * <td>a * b</td>	    <td>a.times(b) </td>
     * </tr>
     * <tr>
     * <td>a / b</td>	    <td>a.div(b) </td>
     * </tr>
     * <tr>
     * <td>a % b</td>	    <td>a.rem(b), a.mod(b) (deprecated) </td>
     * </tr>
     * <tr>
     * <td>a..b</td>	        <td>a.rangeTo(b) </td>
     * </tr>
     *  </table>
     */
    fun operator() {
        var a = 1
        var b = 2
        var sum = a + b
        log(sum.toString())
        sum = 0
        sum = a.plus(b)
        log(sum.toString())
    }

    /**
     * 语句，操作
     * if  when
     * while  for  do while
     * break continue
     */
    fun statement() {

        var num = 1
        //if 基本与java中相同，
        //java 中的三目运算，使用if代替
        //kotlin中if支持块级操作  
        //（闭包） 这个概念，目前不是很理解（6.29）

        //三目 
        //String result = num % 2 == 0 ? "偶数" : "奇数";//Java
        var result = if (num % 2 == 0) "偶数" else "奇数"//Kotlin
        log(result)
        //可以有更多种的写法，最后一行为返回值
        result = if (num % 2 == 0) {
            "偶数"
        } else {
            "奇数"
        }
        log(result)

        //when  kotlin 用when替换switch 
        // 但是不使用case  break 直接返回
        result = when (num) {
            1 -> "num = 1"
//            'a' -> " num = a"   //会检查num类型
            2 -> "num = 2"
            8, 99, 1000 -> "num = 8,99,1000"
            else -> " other"
        }
        log(result)

        /*
            for循环 
            类似java的 foreach(增强for)
         */

        var arrays = listOf(
                1, 2, 3, 4, 5, 6, 7
        )
        log("item in arrays")
        for (item in arrays) {
            log(item.toString())
        }
        //arrays.indices 获取索引，数组下表

        log("arrayOf(1,2,3,4,5)")
        var arrs = arrayOf(1, 2, 3, 4, 5)
        for (item in arrs) {
            log(item.toString())
        }
        arrs = Array(5, { i -> i * i })

        log(" Array(5,{i->i*i})")
        for (item in arrs) {
            log(item.toString())
        }
        for (index in arrs.indices) {
            log(index.toString())
        }

        //多返回值
        log(" .withIndex()--- 多返回值")
        for ((index, item) in arrs.withIndex()) {
            log("index = $index ---- item = $item")
        }
        //for循环结束


        /*
            while
            do while 
            与java相同
         */
        var i = 1
        while (i < 3) {
            i++
            log(i.toString())
        }

        do {
            log(i.toString())
            i++
        } while (i < 5)

        var first = 0
        var second = 0
        while (first < 9) {
            second = 1
            first++
            while (second <= first) {
                print("$second*$first=${first * second}\t")
                second++
            }
            println()
        }
        /*
        break
        continue
        return
         */

        log("for  break ")
        for (i in 1..3) {
            for (j in 1..9) {
                log("i = $i ,j = $j")
                if (j == 4) {
                    break
                }
            }
        }
        log("for  continue")
        for (i in 1..3) {
            for (j in 1..9) {
                log("i = $i ,j = $j")
                if (j == 4) {
                    continue
                }
            }
        }

    }

}