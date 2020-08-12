package demo.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureNanoTime

class KotlinCoroutine {

}

fun main() {
    globalScopeLaunchExample()
//    var answer: String =
    println("------------------------Async-------------------------")
    asyncScopeLaunchExample()
//    print(answer)
    while (true){}

}

fun asyncScopeLaunchExample() {
//    var time = measureNanoTime {
        GlobalScope.async {
            var answer1 = async { networkCall1() }
            var answer2 = async { networkCall2() }

            println(answer1.await() + " " + answer2.await())

        }
//    }
//    println(time)
}

private fun globalScopeLaunchExample() {
    GlobalScope.launch {
//        delay(3000)
        println("Inside co-routine 1: ${Thread.currentThread().name}")
    }
    println("Main: ${Thread.currentThread().name}")

    GlobalScope.launch {
        val answer1 = networkCall1()
        val answer2 = networkCall2()
        println(answer1)
        println(answer2)
    }
    runBlocking { delay(4000L) }

    var job: Job = GlobalScope.launch {
        for (i in 1..10) {
            delay(1000L)
            if (isActive)
                println("Running: $i")
            else
                break
        }
    }

    runBlocking {
        delay(3000L)
        job.cancel()
        println("Job is cancelled")
    }
}

suspend fun networkCall1(): String{
    delay(1000)
    println("Network call 1  ${Thread.currentThread().name}")
    return "Network Call 1 answer"
}


suspend fun networkCall2(): String{
    delay(1000)
    println("Network call 2  ${Thread.currentThread().name}")
    return "Network Call 1 answer"
}