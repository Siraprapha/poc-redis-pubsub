package com.example.poc.redis.pubsub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocRedisPubsubApplication

fun main(args: Array<String>) {
	runApplication<PocRedisPubsubApplication>(*args)
}
