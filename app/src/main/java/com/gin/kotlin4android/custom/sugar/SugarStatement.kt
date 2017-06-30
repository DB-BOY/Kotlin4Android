package com.gin.kotlin4android.custom.sugar

import com.gin.kotlin4android.custom.Utils

/**
 * Created by wang.lichen on 2017/6/30.
 */

class SugarStatement {

    constructor() {
        statement()
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
        Utils.log(result)
        //可以有更多种的写法，最后一行为返回值
        result = if (num % 2 == 0) {
            "偶数"
        } else {
            "奇数"
        }
        Utils.log(result)

        //when  kotlin 用when替换switch 
        // 但是不使用case  break 直接返回
        result = when (num) {
            1 -> "num = 1"
//            'a' -> " num = a"   //会检查num类型
            2 -> "num = 2"
            8, 99, 1000 -> "num = 8,99,1000"
            else -> " other"
        }
        Utils.log(result)

        /*
            for循环 
            类似java的 foreach(增强for)
            
            指定范围的for 循环  for x in 1..3  
            这种写法，类似pl/sql中for循环的写法(见识少，轻喷)
           
         */

        var arrays = listOf(
                1, 2, 3, 4, 5, 6, 7
        )
        Utils.log("item in arrays")
        for (item in arrays) {
            Utils.log(item.toString())
        }
        //arrays.indices 获取索引，数组下表

        Utils.log("arrayOf(1,2,3,4,5)")
        var arrs = arrayOf(1, 2, 3, 4, 5)
        for (item in arrs) {
            Utils.log(item.toString())
        }
        arrs = Array(5, { i -> i * i })

        Utils.log(" Array(5,{i->i*i})")
        for (item in arrs) {
            Utils.log(item.toString())
        }
        for (index in arrs.indices) {
            Utils.log(index.toString())
        }

        //多返回值
        Utils.log(" .withIndex()--- 多返回值")
        for ((index, item) in arrs.withIndex()) {
            Utils.log("index = $index ---- item = $item")
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
            Utils.log(i.toString())
        }

        do {
            Utils.log(i.toString())
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

        Utils.log("for  break ")
        for (i in 1..3) {
            for (j in 1..9) {
                if (j == 4) {
                    Utils.log("-----------------------------j = $j")
                    break
                }
                Utils.log("i = $i ,j = $j")
            }
        }

        Utils.log("for  continue")
        for (i in 1..3) {
            for (j in 1..9) {
                if (j == 4) {
                    Utils.log("-----------------------------j = $j")
                    continue
                }
                Utils.log("i = $i ,j = $j")
            }
        }

        /*
        break ，continue 配合 loop使用
         */

        Utils.log("for  break loop")
        loop@ for (i in 1..3) {
            for (j in 1..9) {
                Utils.log("i = $i ,j = $j")
                if (j == 4) {
                    break@loop
                }
            }
        }
        Utils.log("for  continue loop")
        loop@ for (i in 1..3) {
            for (j in 1..9) {
                Utils.log("i = $i ,j = $j")
                if (j == 4) {
                    continue@loop
                }
            }
        }
    }

}