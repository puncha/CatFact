package me.puncha

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun fetchFact(repository: CatFactRepository) {
    CoroutineScope(Dispatchers.Default).launch {
        try {
            println("Start to call repository.getFact()")
            val result = repository.getFact()
            println(result)
        } catch (t: Throwable) {
            println(t.message)
        }
    }
}
