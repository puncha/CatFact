package me.puncha

import kotlin.reflect.typeOf

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    typeOf<CatFactRepository>()
    typeOf<CatFactService>()
}