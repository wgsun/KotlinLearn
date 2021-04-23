package com.examply.kotlinlearn.curoutine
import kotlinx.coroutines.*

/**
 *@author:wgsun
 *2021/4/22
 *desc:
 */
class CuroutineTest {

    //协程挂起
    fun test() {
        GlobalScope.launch {
            delay(1000L)
            println("world!")
        }
        println("Hello,")
    }

    //结构化并发
    fun test1() = runBlocking {
        launch {
            delay(1000L)
            println("world!")
        }
        println("Hello,")
    }

    //取消
    suspend fun test2() {
        val job = GlobalScope.launch {
            repeat(1000) { i ->
                println("job: I'm sleeping $i ...")
                delay(500L)
            }
        }
        delay(1300L)
        println("main: I'm tired of waiting!")
        job.cancel()
        job.join()
        println("main: Now I can quit")
    }

    //管理长时间运行的任务
    suspend fun fetchDocs(i: Int) {
        val result = get("https://developer.android.com")
        println("$i $result")
    }

    suspend fun get(url: String) = withContext(Dispatchers.IO) {

    }

    //并行分解
    suspend fun fetchTwoDocs() {
        /*coroutineScope {
            val defferredOne = async { fetchDocs(1) }
            val defferredTwo = async { fetchDocs(2) }
            defferredOne.await()
            defferredTwo.await()
        }*/

        coroutineScope {
            delay(2000L)
            val defferreds = listOf(
                async { fetchDocs(1) },
                async { fetchDocs(2) }
            )
            defferreds.awaitAll()
            cancel()
        }
    }


}