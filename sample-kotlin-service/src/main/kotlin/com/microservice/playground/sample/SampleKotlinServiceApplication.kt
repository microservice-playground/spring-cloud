package com.microservice.playground.sample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
open class SampleKotlinServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(SampleKotlinServiceApplication::class, *args)
}