package com.example.jpaexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaExampleApplication

fun main(args: Array<String>) {
	runApplication<JpaExampleApplication>(*args)
}
