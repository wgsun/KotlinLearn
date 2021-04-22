package com.examply.kotlinlearn.generic

/**
 *@author:wgsun
 *2021/4/12
 *desc: 泛型类
 */
class JenericClass {
    fun jenericTest() {
        //val box = Box(1)
        val box = Box<Int>(1)
        //val box1 = Box("jeneric")
        val box1 = Box<String>("jeneric")
    }
}

class Box<T> (t: T) {
    var value = t
}

//Kotlin 泛型函数的声明与 Java 相同，类型参数要放在函数名的前面
fun <T> doPrintln(content: T) {
    when(content) {
        is Int -> println("整型数字为 $content")
        is String -> println("字符串转换为大写：${content.toUpperCase()}")
        else -> println("T 不是整型，也不是字符串")
    }
}


//声明处型变 使用协变注解修饰符：in、out，消费者 in, 生产者 out。
//使用 out 使得一个类型参数协变，协变类型参数只能用作输出，可以作为返回值类型但是无法作为入参的类型：
 class Runoob<out A>(val a: A) {
    fun foo(): A{
        return a
    }
}

//in 使得一个类型参数逆变，逆变类型参数只能用作输入，可以作为入参的类型但是无法作为返回值的类型：
class Runoob1<in A>(a: A) {
    fun foo(a: A) {

    }
}



//类型投影

//星号投射
