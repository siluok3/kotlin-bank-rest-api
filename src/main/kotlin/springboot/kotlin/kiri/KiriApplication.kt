package springboot.kotlin.kiri

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KiriApplication

fun main(args: Array<String>) {
	runApplication<KiriApplication>(*args)
}
