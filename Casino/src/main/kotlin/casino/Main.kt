package casino

import casino.blackjack.Deck

fun main() {
    val deck = Deck()
    println(deck)
    println(deck.deal(5))
    println(deck)
}
