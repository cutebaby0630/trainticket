package com.train

import sun.security.krb5.internal.Ticket
import java.lang.Math.round
import java.util.*

fun main(){
    var exit = 0
    val scanner = Scanner(System.`in`)
    while(exit != -1){

        //使用者輸入總票數
        print("Please enter number of tickets:")
        var ticketsNum = scanner.nextInt()

        //使用者輸入來回票張數
        print("How many round-trip tickets: ")
        val roundTrip = scanner.nextInt()

        //判斷輸入是否為有效張數
        if (ticketsNum <= 0  || roundTrip < 0){
            println("Please enter the true number")
        }else{
            //印出結果
            val tickets = Ticket(ticketsNum,roundTrip)
            println("Total tickets: " + ticketsNum )
            println("Round-trip: " + roundTrip)
            println("Total: " + tickets.total())

            //詢問是否繼續
            println("Continue to enter 0, Exit to enter -1")
            exit = scanner.nextInt()
        }

    }
    println("Thanks to having")
}


class Ticket(var ticketsnum: Int, var roundTrip: Int){
    fun total(): Int {
        // 假設只有台北到高雄的票，單程票價1000元，來回票為2000元再打九折
        val total = 1000 * (ticketsnum - roundTrip) + round((2000 * roundTrip) * 0.9f)
        return total
    }
}