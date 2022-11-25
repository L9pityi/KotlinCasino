package casino.blackjack

class Deck {
    private val deck: MutableList<Card> = mutableListOf()

    init {
        for (suit in Suit.values()) {
            for (rank in Rank.values()) {
                deck.add(Card(rank, suit))
            }
        }
        deck.shuffle()
    }

    fun dealCard(): Card {
        return deck.removeAt(0)
    }

    override fun toString(): String {
        return deck.toString()
    }
}
