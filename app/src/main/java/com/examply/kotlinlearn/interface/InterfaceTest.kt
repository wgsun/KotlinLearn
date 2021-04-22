package com.examply.kotlinlearn.`interface`

/**
 *@author:wgsun
 *2021/4/10
 *desc:
 */
class InterfaceTest {
}

interface MyInterface{
    //接口中的属性只能是抽象的，不允许初始化值，接口不会保存属性值，实现接口时，必须重写属性
    //name 属性，抽象的
    var name : String
    fun bar()
    fun foo() {
        println("foo")
    }
}

class Child: MyInterface{

    //重写属性
    override var name: String = ""

    override fun bar() {
        println("bar")
    }
}
