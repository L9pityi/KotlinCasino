package casino.blackjack

class Deck {
    private val deck: MutableList<Card>

    init {
        deck = mutableListOf()
        for (suit in Suit.values()) {
            for (rank in Rank.values()) {
                deck.add(Card(rank, suit))
            }
        }
        deck.shuffle()
    }

    override fun toString(): String {
        return deck.toString()
    }
}
