package com.trainKotlin

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    println(" Please enter number of tickets:")
    var count = scanner.nextInt()
    println("How many round-trip tickets:")
    var discount = scanner.nextInt()
    val ticket = Ticket(count, discount)
    ticket.print()
}

class Ticket(var count : Int, var discount : Int) {
    fun print(){
        System.out.println("Total tickets: " + (count+discount) +
                " Round-trip: $discount Total: ${getAverage()}" )
    }
    fun getAverage() = ((count * 1000) + ((discount * 2000 * 0.9).toInt()))
}