package com.cripstian

import io.ktor.server.engine.embeddedServer
import io.ktor.server.jetty.Jetty
import com.cripstian.plugins.configureRouting
import com.cripstian.plugins.configureSecurity
import com.cripstian.plugins.configureSerialization

fun main() {
    embeddedServer(Jetty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
