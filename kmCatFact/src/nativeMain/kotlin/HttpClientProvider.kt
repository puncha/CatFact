package me.puncha

import io.ktor.client.*
import io.ktor.client.engine.curl.*

actual class HttpClientProvider {
    actual fun provideHttpClient(): HttpClient {
        // I have to disable SSL Verify, or it failed with:
        // TLS verification failed for request: CurlRequestData(url='https://catfact.ninja/fact',
        // method='GET', content: 0 bytes). Reason: SSL peer certificate or SSH remote key was not OK
        return HttpClient(Curl) {
            engine {
                sslVerify = true
            }
        }
    }
}