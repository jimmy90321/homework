package com.train.kotlin

fun main() {
    val t = Ticket()

    print("Please enter number of tickets: ")
    var totalAmount = readLine()!!.toInt()
    do {
        t.totalAmount = totalAmount

        print("How many round-trip tickets: ")
        t.roundAmount = checkRound(totalAmount)

        t.printOut()

        print("Please enter number of tickets( Or enter \"-1\" to quit system): ")
        totalAmount = readLine()!!.toInt()
    } while (totalAmount != -1)
}

private fun checkRound(totalAmount: Int): Int {
    var roundAmount = readLine()!!.toInt()
    while (roundAmount > totalAmount) {
        println("Amount of round-trip tickets can't higher than total amount, please enter again")
        print("How many round-trip tickets: ")
        roundAmount = readLine()!!.toInt()
    }
    return roundAmount
}

class Ticket(var totalAmount: Int = 0, var roundAmount: Int = 0) {
    private val price = 1000
    private val discount = 0.9f

    private fun finalPrice(): Int {
        return price * (totalAmount - roundAmount) + (price * roundAmount * 2 * discount).toInt()
    }

    fun printOut() {
        println("=========================================================")
        println("Total tickets: $totalAmount")
        println("Round-trip: $roundAmount")
        println("Total: ${finalPrice()}")
        println("=========================================================")
    }
}