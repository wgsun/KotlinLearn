package com.examply.kotlinlearn.chapter1

/**
 * @author wgsun
 * @descrbe 类中声明变量
 * @since 2020/12/10 19:57
 */
public class Section2 {

    //定义属性
    var var_a : Int  = 0
    val val_a : Int = 0

    //初始化
    init {
        var_a = 10
        println("var_a => $var_a \t val_a => $val_a")
    }

}