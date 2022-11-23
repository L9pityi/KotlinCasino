package casino.blackjack

class Blackjack(maxNumberOfHands: Int = 5) {
    private val players = mutableListOf<Player>()
    private val playerHands = mutableListOf<Hand>()
    private val dealerHand = Hand(Player("DEALER"))

    init {
        repeat(maxNumberOfHands) {
            playerHands.add(Hand(null))
        }
    }

    fun addPlayer(player: Player, numberOfHands: Int = 1): List<Hand> {
        val hands = mutableListOf<Hand>()
        for (hand in playerHands) {
            if (hand.addPlayer(player)) {
                hands.add(hand)
                if (hands.size == numberOfHands) return hands
            }
        }
        return hands
    }

    fun startTurn() {
        val deck = Deck()
        repeat(2) {
            for (hand in playerHands) {
                if (hand.player != null) {
                    hand.addCards(deck.deal())
                }
            }
            dealerHand.addCards(deck.deal())
        }
    }
}
