package me.puncha

import io.ktor.client.*

actual class HttpClientProvider actual constructor() {
    actual fun provideHttpClient(): HttpClient {
        return HttpClient()
    }
}