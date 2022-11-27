package casino.blackjack

class Blackjack(maxNumberOfHands: Int = 5) {
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

    fun startRound() {
        val deck = Deck()
        dealStart(deck)
        println("Dealer: $dealerHand")
    }

    private fun dealStart(deck: Deck) {
        dealFirstCards(deck)
        dealSecondCards(deck)
    }

    private fun dealFirstCards(deck: Deck) {
        dealPlayers(deck)
        dealDealer(deck, true)
    }

    private fun dealSecondCards(deck: Deck) {
        dealPlayers(deck)
        dealDealer(deck)
    }

    private fun dealPlayers(deck: Deck) {
        for (hand in playerHands) {
            if (hand.player != null) {
                hand.addCard(deck.dealCard().also { card ->  card.turnOver() })
            }
        }
    }

    private fun dealDealer(deck: Deck, isFirstRound: Boolean = false) {
        if (isFirstRound) dealerHand.addCard(deck.dealCard().also { card -> card.turnOver() })
        else dealerHand.addCard(deck.dealCard())
    }
}
