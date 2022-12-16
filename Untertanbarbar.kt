     // Todo Vererbung einbauen  // Todo Construktor nicht vergessen(PrimärenKonstruktor eingebaut)
class Untertanbarbar(name: String, hp: Int, level: Int) : Gegner(name, hp, level) {

    // Todo Attacke überschreiben
    override var listeAttacken: List<String> = listOf("Unnachgieber Geist", "Wildes Blut", "Sanktion", "Lohars Prüfung")

    //Todo Gegner führt die Attacke aus //// Todo auswahl noch ändern

    override fun attackeGegner(held: Helden, listeGegner: MutableList<Gegner>) {
        if (!this.istKo && !held.isKo) {
            var aktuelleAttacke = listeAttacken.random()
            println("Der ${this.name} hat die Attacke: $aktuelleAttacke ausgewählt")
            var schaden: Double = this.schadenswert

            when (aktuelleAttacke) {
                "Unnachgieber Geist" -> {
                    schaden = 0.35 * schadenswert
                }

                "Wildes Blut" -> {
                    schaden = 0.23 * schadenswert
                }

                "Sanktion" -> {
                    schaden = 0.41 * schadenswert
                }

                "Lohars Prüfung" -> {
                    schaden = 0.19 * schadenswert
                }

            }

            println("${this.name} greift ${held.name} mit $aktuelleAttacke für ${schaden.toInt()} an")
            println()
            held.loseHp(schaden.toInt())
            //println("Der Held ${held.name} hat noch ${held.hp} Hp übrig")
        } else if (held.hp == 0) {
            println("Attacke kann nicht ausgeführt werden, Held ist Ko")
        }
    }
}