package com.examply.kotlinlearn.extends

/**
 *@author:wgsun
 *2021/4/10
 *desc:
 */
open class Person(var name: String, var age: Int) {
    //在基类中，使用fun声明函数时，此函数默认为final修饰，不能被子类重写。如果允许子类重写该函数，那么就要手动添加 open 修饰它
    open fun study() {
    }
}

class Student(name : String, age: Int, var no : String, var score: Int) : Person(name, age) {
    //子类重写方法使用 override 关键词
    override fun study() {
    }
}

/**
 * 用户基类
 */
open class Person1(name : String) {
    constructor(name: String, age: Int) : this(name) {
        //初始化
        println("------基类次级构造函数------")
    }
}

class Student1: Person1 {
    constructor(name: String, age: Int, no: String , score: Int) : super(name, age) {
        println("-------继承类次级构造函数---------")
        println("学生名： ${name}")
        println("年龄： ${age}")
        println("学生号： ${no}")
        println("成绩： ${score}")
    }
}

open class A {
    open fun f() {
        print("A")
    }
    fun a(){
        print("a")
    }
}

interface B {
    fun f() { print("B")}
    fun b() { print("b")}
}

class C : A(), B {

    /**
     * 如果有多个相同的方法（继承或者实现自其他类，如A、B类），则必须要重写该方法，使用super范型去选择性地调用父类的实现。
     */
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}

interface Foo{
    val count: Int
}

class Foo1(override val count: Int) : Foo

class Foo2: Foo{
    override var count = 0
}