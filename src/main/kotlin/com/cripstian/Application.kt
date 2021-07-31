package com.cripstian

import io.ktor.server.engine.*
import io.ktor.server.jetty.*
import com.cripstian.plugins.*

fun main() {
    embeddedServer(Jetty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
