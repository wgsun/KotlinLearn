package com.examply.kotlinlearn.chapter1

/**
 * @author wgsun
 * @descrbe 后期初始化属性
 * @since 2020/12/10 20:25
 */
public class Section4 {

    //声明一个延迟初始化的字符串数组常量
    private val mTitles : Array<String> by lazy{
        arrayOf("", "", "")
    }

    //声明一个延迟初始化的字符串
    private val mStr : String by lazy{
        ""
    }
}