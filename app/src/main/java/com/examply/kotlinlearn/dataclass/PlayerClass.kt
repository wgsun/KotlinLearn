package com.examply.kotlinlearn.dataclass

/**
 *@author:wgsun
 *2021/5/13
 *desc:
 */
class PlayerClass(val name: String, var age: Int) {
}


data class DataClassDemo(
    val name: String,
    val age : Int
)

data class PlayDataClass(val name: String, var age: Int) {
    var point: Int = 0

    constructor(name:String, age: Int, point: Int) : this(name, age) {
        this.point = point
    }
}

fun DataClassTest() {
    val player = PlayerClass("wgsun", 28)
    val playerDataClass = PlayDataClass("wgsun", 28)
    println(player.toString())
    println(playerDataClass.toString())
    println(playerDataClass.component1())
    println(playerDataClass.component2())
    val playDataClass3 = playerDataClass.copy( name = "zst", age = 25)
    println(playDataClass3.toString())

    val player2 = PlayerClass("wgsun", 28)
    println(player == player2)
    println(player.hashCode())
    println(player2.hashCode())

    val playerDataClass2 = PlayDataClass("wgsun", 28)
    println(playerDataClass == playerDataClass2)
    println(playerDataClass.hashCode())
    println(playerDataClass2.hashCode())

}