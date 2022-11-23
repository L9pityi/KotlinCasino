package casino.blackjack

class Hand(player: Player?) {
    var player: Player? = player
        private set
    private val cards: MutableList<Card> = mutableListOf()

    fun addPlayer(newPlayer: Player): Boolean {
        return if (player == null) {
            player = newPlayer
            true
        } else false
    }

    fun removePlayer() {
        player = null
    }

    fun addCards(newCards: List<Card>) {
        cards += newCards
    }

    override fun toString(): String {
        return cards.toString()
    }
}
