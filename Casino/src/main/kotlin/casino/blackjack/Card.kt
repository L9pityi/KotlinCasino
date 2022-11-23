package casino.blackjack

class Card(private val rank: Rank, private val suit: Suit) {
    override fun toString(): String {
        return "$rank of $suit"
    }
}
