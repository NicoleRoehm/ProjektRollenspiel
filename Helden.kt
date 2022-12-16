open class Helden(
    var name: String,
    var hp: Int,
    var level: Int,
) {
     //Todo Lebenspunkte abziehen
    var schadenswerte: Double = 1.0 * level
    var isKo: Boolean = false

    fun loseHp(lost: Int) {

        this.hp -= lost

        if (this.hp <= 0) {
            this.isKo = true
            println("$name hat keine Lebendspunkte mehr übrig")
        } else {
            println("$name hat noch $hp übrig")
            println("-----------------------------------------------------------------------------------")
        }
    }
    //Todo Attackenliste und Funktion Attacke Helden
    open var listeAttacke: MutableList<String> = mutableListOf()
    open fun attackeHelden(gegner: Gegner) {}
}







