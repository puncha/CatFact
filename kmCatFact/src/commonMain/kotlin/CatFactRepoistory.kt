package me.puncha

// Manage Cat facts
class CatFactRepository(catFactService: CatFactService) {
    private val service: CatFactService = catFactService

    fun welcome(): String {
        return "Welcome to use CatFact repository!"
    }

    suspend fun getFact(): String {
        return service.getFact()
    }
}