package by.morka.bimbom.member

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class MemberApplication

fun main(args: Array<String>) {
    runApplication<MemberApplication>(*args)
}

@RestController
class MemberController {

    @GetMapping
    fun helloWorld() = "Hello, World!"
}