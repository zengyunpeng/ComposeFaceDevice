package com.intellif.composefacedevice

import kotlinx.coroutines.*
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        GlobalScope.launch {
            withContext(Dispatchers.Unconfined) {
                println(1)
                withContext(Dispatchers.Unconfined) { // Nested unconfined
                    println(2)
                }
                println(3)
            }
            println("Done")
        }
        Thread.sleep(10000)
    }
}