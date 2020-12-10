package com.examply.kotlinlearn.chapter1

/**
 * @author wgsun
 * @descrbe 变量用法
 * @since 2020/12/10 17:41
 */
public class Section1 {

    fun test(){
        //立即初始化
        var var_a : Int = 10
        //推导出类型
        var var_b = 5

        println("var_a => $var_a \t var_b => $var_b")

        //立即初始化
         val val_a : Int = 100
        //推导出类型
        val val_b = 50
        println("val_a => $val_a \t val_b => val_b")
    }

}