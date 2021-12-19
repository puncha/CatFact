package me.puncha

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class CatFactService {
    private val client: HttpClient = HttpClientProvider().provideHttpClient()

    // TODO: move URL to argument
    suspend fun getFact(): String {
        val response: HttpResponse = client.request("https://catfact.ninja/fact")
        return response.receive()
    }
}