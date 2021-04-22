package com.examply.kotlinlearn.dataclass

/**
 *@author:wgsun
 *2021/4/10
 *desc: 数据类
 * 在大多数情形中，命名数据类是更好的设计选择，因为这样代码可读性更强而且提供了有意义的名字和属性
 */
class DataClass {
    fun dataTest() {
        val user = User("jake", 1)
        val copy = user.copy(age = 2)
        print(user) //User(name=Jack, age=1)
        print(copy) //User(name=Jack, age=2)

        //解构声明
        val(name, age) = user
        println("$name, $age years of age")
    }
}

data class User(val name: String, val age: Int)


