package com.cripstian

import com.cripstian.plugins.configureRouting
import com.cripstian.plugins.configureSecurity
import com.cripstian.plugins.configureSerialization
import io.ktor.server.engine.embeddedServer
import io.ktor.server.jetty.Jetty

fun main() {
    embeddedServer(Jetty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
