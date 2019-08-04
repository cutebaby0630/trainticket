package com.train

import sun.security.krb5.internal.Ticket
import java.lang.Math.round
import java.util.*

fun main(){
    var exit = 0
    val scanner = Scanner(System.`in`)
    while(exit != -1){

        //使用者輸入總票數
        println("Please enter number of tickets:")
        var ticketsnum = scanner.nextInt()

        //使用者輸入來回票張數
        println("How many round-trip tickets: ")
        var roundTrip = scanner.nextInt()

        //判斷輸入是否為有效張數
        if (ticketsnum < 1 || roundTrip < 0){
            println("Please enter the true number")
        }else{
            //印出結果
            val tickets = Tickets(ticketsnum,roundTrip)
            print("Total tickets: " + ticketsnum + "\n" + "Round-trip: " + roundTrip + "\n" + "Total: " + tickets.total())
            //詢問是否繼續
            println("Continue to enter 0, Exit to enter -1")
            exit = scanner.nextInt()
        }

    }
}
class Tickets(var totaltickets: Int,var roundTripTickets: Int){
    fun total(): Int{
        //計算得到值並且回傳
        val price = 1000 * (totaltickets-roundTripTickets) + round((2000 * roundTripTickets) * 0.9f)
        return price
    }
}