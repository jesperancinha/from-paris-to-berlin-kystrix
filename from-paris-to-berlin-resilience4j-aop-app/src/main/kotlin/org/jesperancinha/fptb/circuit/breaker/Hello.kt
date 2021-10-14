package org.jesperancinha.fptb.circuit.breaker

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class Hello {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, World")
            SpringApplication.run(Hello::class.java, *args)
        }
    }
}