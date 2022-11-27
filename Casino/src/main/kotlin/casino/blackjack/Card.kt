package casino.blackjack

class Card(private val rank: Rank, private val suit: Suit) {
    private var faceUp: Boolean = false

    fun turnOver() {
        faceUp = !faceUp
    }

    override fun toString(): String {
        if (faceUp) return "$rank of $suit"
        else return "Face down card"
    }
}
