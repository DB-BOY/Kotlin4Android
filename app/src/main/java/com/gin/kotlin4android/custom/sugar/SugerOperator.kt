package com.gin.kotlin4android.custom.sugar

import com.gin.kotlin4android.custom.Utils

/**
 * Created by wang.lichen on 2017/7/3.
 */
class SugerOperator {
    constructor() {

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
        Utils.log(sum.toString())
        sum = 0
        sum = a.plus(b)
        Utils.log(sum.toString())

        a.inc()
        a.dec()


        var flag = false
        flag.not()//


    }

}