package cn.dbboy.kotlin4android.custom.sugar

import cn.dbboy.kotlin4android.custom.Utils

/**
 * Created by wang.lichen on 2017/6/30.
 */

class SugarFun {

    constructor() {
        function()
    }

    /**
     * java 中的方法
     * kotlin 函数       fun 函数名(参数列表) : 返回值类型(默认Unit){    balabala .....}
     *
     * 1.无返回值
     *
     * 2.参数可以有默认值，一个参数搞定java的重载
     * 注： 参数列表中，靠后的参数可以省略，中间的不可以
     * *
     * * 想要跳过中间的参数，需要指定
     * * 想到了sql中insert的写法(见识少，轻喷)
     *
     * 3.可变参数
     *
     *
     */
    fun function() {

//        Utils.log("nonReturn():  ${nonReturn()}")
//        Utils.log("getAge():  ${getAge()}")
//        Utils.log("add(3,1,1):  ${add(3, 0, 1)}")
//        Utils.log("outStr(3,asd,true):  ${outStr(3, "asd", true)}")
//        Utils.log("outStr(3,dada):  ${outStr(3, "dada")}")
//        Utils.log("outStr(3,true):  ${outStr(3, bo1 = true)}")
//        Utils.log("varFun(3,4,5,6,7,8,9):  ${varFun(3, 4, 5, 6, 7, 8, 9)}")
        innerFun()

    }

    /**
     * 无返回值
     */
    fun nonReturn() {
        Utils.log("nonReturn()")
    }


    /**
     *  返回值
     */
    fun getAge(): Int {
        return 3
    }

//还没想好，
//    fun min(x1: Int = 0,x2 :Int = 0,x3:Int = 0): Int{
//        
//        return 
//    }

    /**
     * 带参数
     */
    fun add(x1: Int = 0, x2: Int = 0, x3: Int = 0): Int {
        return x1 + x2 + x3
    }
    //简化,单一表达式写法
    //   fun add(x1: Int = 0, x2: Int = 0, x3: Int = 0): Int = x1 + x2 + x3
    
    fun outStr(x1: Int = 0, str1: String = "", bo1: Boolean = false): String {
        return "x1: $x1   str1: $str1  bo1: $bo1"
    }

    /**
     * 可变参数
     */
    fun varFun(vararg arrs: Int): Int {
        var sum = 0
        for (item in arrs) {
            sum += item
        }
        return sum
    }

    /**
     * 闭包
     * 函数内函数
     */
    fun innerFun() {
        var arg = 1

        fun inFun() {
            arg++
            Utils.log("in arg : $arg")
        }

        Utils.log("out arg : $arg")
        inFun()
        inFun()
        Utils.log("out arg : $arg")

        test
    }

    var flag = true
    var test = if (flag) {
        Utils.log("true")
    } else {
        Utils.log("false")
    }
    
    
}