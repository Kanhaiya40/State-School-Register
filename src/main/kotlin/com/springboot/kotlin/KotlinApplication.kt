package com.springboot.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class KotlinApplication
val s="Kotlin";
fun main(args: Array<String>) {
    runApplication<KotlinApplication>(*args)

    print("This is Spring Project With:"+s)
}
