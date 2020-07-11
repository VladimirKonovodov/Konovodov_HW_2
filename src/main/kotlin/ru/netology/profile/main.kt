package ru.netology.profile


import model.Profile
import java.util.*

fun main() {

    val kotlinRules = Profile(1, "start", "Aaron", "Aaronson", "true", "sugar babe")
    println(kotlinRules.fullname)
}