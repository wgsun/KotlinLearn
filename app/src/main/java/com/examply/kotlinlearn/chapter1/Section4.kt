package com.examply.kotlinlearn.chapter1

import com.google.android.material.tabs.TabLayout

/**
 * @author wgsun
 * @descrbe 后期初始化属性/延迟初始化属性
 * @since 2020/12/10 20:25
 */
public class Section4 {

    /**
     * 后期初始化属性
     */
    //声明组件
    private lateinit var mTabLayout : TabLayout
    //lateinit var a : Int 会报错，不能用于基本数据类型
    //赋值
    //mTabLayout = find(R.id.**)
    //使用
    //mTabLayout.setupWithViewPager(mViewPager)

    /**
     * 延迟初始化属性（当程序在第一次使用到这个变量（属性）的时候在初始化）
     * 1、使用lazy{}高阶函数，不能用于类型推断。且该函数在变量的数据类型后面，用by链接。
     * 2、 必须是只读变量，即用val声明的变量
     */
    // 声明一个延迟初始化的字符串数组变量
    private val mTitles : Array<String> by lazy {
        arrayOf("", "", "")
    }

    // 声明一个延迟初始化的字符串
    private val mStr : String by lazy {
        ""
    }

}