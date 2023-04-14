package ktor

import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.cache.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonPrimitive
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.singleton

private const val apiUrl = "http://10.0.2.2:8080" // ip для эмулятора

internal val ktorModule = DI.Module("ktorModule") {
    bind<HttpClient>() with singleton {
        HttpClient(HttpEngineFactory().createEngine()) {
            install(Logging) {
                logger = Logger.SIMPLE
                level = LogLevel.ALL
            }
            install(HttpTimeout) {
                connectTimeoutMillis = 15_000
                requestTimeoutMillis = 30_000
            }

            defaultRequest {
                url(apiUrl)
                header("Content-Type", "application/json; charset=UTF-8")
            }
        }
    }
}