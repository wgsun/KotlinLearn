package com.examply.kotlinlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.examply.kotlinlearn.chapter1.Section1
import com.examply.kotlinlearn.chapter1.Section2
import com.examply.kotlinlearn.chapter1.Section3
import com.examply.kotlinlearn.curoutine.CuroutineTest
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val section1 = Section1()
        section1.test()
        Section2()
        Section3()*/

        //CuroutineTest().test()
        //CuroutineTest().test2()
        /*GlobalScope.launch {
            CuroutineTest().test2()
        }*/
        /*GlobalScope.launch {
            CuroutineTest().fetchDocs()
        }*/
        GlobalScope.launch {
            CuroutineTest().fetchTwoDocs()
        }

    }
}