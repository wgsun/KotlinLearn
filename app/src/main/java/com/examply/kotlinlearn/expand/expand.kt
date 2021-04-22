package com.examply.kotlinlearn.expand

/**
 *@author:wgsun
 *2021/4/10
 *desc:
 */


/*fun receiverType.functionName(params){
    body
}*/
//receiverType：表示函数的接收者，也就是函数扩展的对象
//functionName：扩展函数的名称
//params：扩展函数的参数，可以为NULL

class expand {

}

class User(var name: String)

fun User.Print() {
    print("用户名&name")
}

// 扩展函数 swap,调换不同位置的值
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

//若扩展函数和成员函数一致，则使用该函数时，会优先使用成员函数。
class C {
    fun foo() { println("成员函数") }
}

fun C.foo() { println("扩展函数") }

fun main(arg:Array<String>){
    var c = C()
    c.foo() //输出为：“成员函数”
}

fun Any?.toString(): String {
    if (this == null) return "null"
    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
    // 解析为 Any 类的成员函数
    return toString()
}


/**
 * 伴生对象的拓展
 */
class MyClass(){
    companion object{} // 将被称为 "Companion"
}

fun MyClass.Companion.foo() {
    println("伴生对象的拓展函数")
}

val MyClass.Companion.no: Int
    get() = 10



