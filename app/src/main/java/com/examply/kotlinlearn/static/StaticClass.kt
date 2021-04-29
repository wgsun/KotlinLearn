package com.examply.kotlinlearn.static

/**
 *@author:wgsun
 *2021/4/29
 *desc: kotlin 实现静态的四种方式
 */

//1，companion object - 伴随对象，声明单例的方式
class StaticClass {

    var name: String = "aa"

    fun speak() {}

    companion object {
        @JvmField
        var nameStatic: String = "bb"

        @JvmStatic
        fun speakStatic() {}
    }
}

//2，@JvmField + @JvmStatic 注解 - 使用注解标签声明 static 的部分
class StaticClass1 {

    var name: String = "aa"

    fun speak() {}

    companion object {
        @JvmField
        var nameStatic: String = "bb"

        @JvmStatic
        fun speakStatic() {}
    }
}

//3，object 单例 - 静态单例其实和 companion object 类似
object StaticClass2 {

    var nameStatic: String = "bb"

    fun speakStatic() {}

}

//4，const - 包内唯一性，脱离类的束缚，kotlin 的特性，在 java 中会编译生成一个 kotlin.kt 的文件专门对齐提供支持
const val name: String = "aa"
fun adk() {}
class StaticClass3 {
    fun speak() {}
}