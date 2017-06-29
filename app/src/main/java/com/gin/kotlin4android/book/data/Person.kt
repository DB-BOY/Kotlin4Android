package com.gin.kotlin4android.book.data

/**
 * Created by wang.lichen on 2017/6/26.
 */
open class Animal(name : String )

class Person(name: String,age: Int) : Animal(name){
    /*
    var
    val
     */
    
    
    
    /*
    函数 
    fun 引起  如无返回，不需要加
    有返回值在参数列表后    ： 返回值类型
     
    eg. fun name(xx: Int) : Int{
        return xx+2
    }
    如只有一行表达式
    eg. fun name(xx: Int) : Int = xx+2 
     
     */
    fun xAge(age : Int){
        age + 3
    }
//    fun xyAge(age : Int): Int{
//        return age +2
//    }
    fun  xyAge(age : Int) : Int = age + 2
    
    fun getAge(age : Int =18): Int{
        return age
    }
}