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

    fun deal(numberOfCards: Int): List<Card> {
        val drawnCards = mutableListOf<Card>()
        repeat(numberOfCards) {
            drawnCards.add(deck.removeAt(0))
        }
        return drawnCards
    }

    override fun toString(): String {
        return deck.toString()
    }
}
