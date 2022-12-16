     // Todo Construktor nicht vergessen(PrimärenKonstruktor eingebaut)
open class Gegner(var name: String, var hp: Int, var level: Int) {

    var schadenswert: Double = 0.8 * level
    var istKo: Boolean = false

    // Todo Lebendspunkte werden abgezogen
    fun hpLose(lost: Int) {

        this.hp -= lost

        if (this.hp <= 0) {
            this.istKo = true
            println("$name hat keine Hp mehr übrig")

        } else {
            "$name hat noch $hp hp übrig"
        }
        println("-----------------------------------------------------------------------------------")
    }
    // Todo Attackenliste Gegner
    open var listeAttacken: List<String> = listOf()

    // Todo Attackegegnerfunktion
    open fun attackeGegner(held: Helden, listeGegner: MutableList<Gegner>) {}


}




