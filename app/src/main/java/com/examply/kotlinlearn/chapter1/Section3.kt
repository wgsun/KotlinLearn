package com.examply.kotlinlearn.chapter1

/**
 * @author wgsun
 * @descrbe 声明可空变量
 * @since 2020/12/10 20:01
 */
public class Section3 {

    //声明可空变量
    var var_a : Int?  = 0
    val val_a : Int? = null

    init {
        var_a = 10
        println("var_a => $var_a \t val_a => $val_a")
    }


}