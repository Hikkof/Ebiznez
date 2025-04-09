import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Message(val content: String)

var discord_url = "YOUR_WEBHOOK"

suspend fun main() {
    val client = HttpClient(CIO) {
        install(ContentNegotiation)
    }

    val message = Message("Hello World")

    try {
        val response: HttpResponse = client.post(discord_url) {
            contentType(ContentType.Application.Json)
            setBody(Json.encodeToString(message))
        }
        println(response)
    } catch (e: Exception) {
        println("Error on POST request: ${e.message}")
    } finally {
        client.close()
    }
}