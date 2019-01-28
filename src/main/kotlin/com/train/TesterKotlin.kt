package com.train.kotlin

import java.util.*

fun main() {
    var t = Ticket()
    val scanner = Scanner(System.`in`)

    print("Please enter number of tickets: ")
    t.totalAmount = scanner.nextInt()

    print("How many round-trip tickets: ")
    t.roundAmount = scanner.nextInt()

    println("Total tickets: ${t.totalAmount}")
    println("Round-trip: ${t.roundAmount}")
    println("Total: ${t.finalPrice()}")
}

class Ticket(var totalAmount: Int = 0, var roundAmount: Int = 0) {
    val price = 1000
    val discount = 0.9f

    fun finalPrice(): Int {
        return price * (totalAmount - roundAmount) + (price * roundAmount * 2 * discount).toInt()
    }
}