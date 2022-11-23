package casino

import casino.blackjack.Blackjack
import casino.blackjack.Player

fun main() {
    val blackjack = Blackjack()
    val alice = Player("Alice")
    val bob = Player("Bob")
    val aliceHands = blackjack.addPlayer(alice, 2)
    val bobHands = blackjack.addPlayer(bob)
    blackjack.startTurn()
    println(aliceHands)
    println(bobHands)
}
