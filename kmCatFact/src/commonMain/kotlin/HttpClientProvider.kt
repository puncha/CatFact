package me.puncha

import io.ktor.client.*

expect class HttpClientProvider() {
    fun provideHttpClient(): HttpClient;
}