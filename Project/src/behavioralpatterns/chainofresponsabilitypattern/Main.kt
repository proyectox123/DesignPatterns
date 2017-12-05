package behavioralpatterns.chainofresponsabilitypattern

import behavioralpatterns.chainofresponsabilitypattern.client.ATMDispenseChain
import behavioralpatterns.chainofresponsabilitypattern.handler.Currency
import java.util.Scanner


fun main(args: Array<String>) {
    val atmDispenser = ATMDispenseChain()
    while (true) {
        println("Enter amount to dispense")
        val input = Scanner(System.`in`)
        val amount = input.nextInt()
        if (amount % 10 != 0) {
            println("Amount should be in multiple of 10s.")
            return
        }
        // process the request
        atmDispenser.chain1?.dispense(Currency(amount))
    }
}