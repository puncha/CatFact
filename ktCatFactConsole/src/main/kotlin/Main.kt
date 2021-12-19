import kotlinx.coroutines.runBlocking
import me.puncha.CatFactRepository
import me.puncha.CatFactService

suspend fun main(args: Array<String>) {
    println("Hello World!")
    val catFactService = CatFactService()
    val catFactRepo = CatFactRepository(catFactService)
    println(catFactRepo.welcome())
    runBlocking { println(catFactRepo.getFact()) }
}