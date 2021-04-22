package com.examply.kotlinlearn.enum

/**
 *@author:wgsun
 *2021/4/12
 *desc: 枚举类
 */
enum class EnumClass {
    RED,GREEN,BLUE
}

//初始化
enum class EnumClass1(val rgb: Int) {
    RED(0),
    GREEN(1),
    BLUE(2)
}