    // Todo Vererbung einbauen  // Todo Construktor nicht vergessen(PrimärenKonstruktor eingebaut)
class Endgegner(name: String, hp: Int, level: Int) : Gegner(name, hp, level) {

    // Todo Liste Attacke
    override var listeAttacken: List<String> = listOf(
        "Fluch",
        "Segen des Marduk",
        "Sturm der Osiris",
        "Zorn der Icener",
        "Hundertjähriger Krieg",
        "Gebrüll des Löwen"
    )

    //Todo Gegner führt die Attacke aus // Todo auswahl noch ändern
    override fun attackeGegner(held: Helden, listeGegner: MutableList<Gegner>) {
        if (!this.istKo && !held.isKo) {
            var aktuelleAttacke = listeAttacken.random()
            println("Es wurde die Attacke: $aktuelleAttacke ausgewählt")
            println()
            var schaden: Double = this.schadenswert

            when (aktuelleAttacke) {

                "Fluch" -> {

                    schaden = 1.0 * schadenswert
                }

                "Segen des Marduk" -> {
                    schaden = 1.5 * schadenswert
                }

                "Sturm der Osiris" -> {
                    schaden = 1.8 * schadenswert
                }

                "Zorn der Icener" -> {
                    schaden = 0.24 * schadenswert
                }

                "Hundertjähriger Krieg" -> {
                    schaden = 0.19 * schadenswert
                }

                "Gebrüll des Löwen" -> {
                    schaden = 0.50 * schadenswert
                }

            }
            when (held.name) {
                "Fluch" -> {
                    schaden *= 3.0
                }

            }

            // Todo println
            println("${this.name} greift ${held.name} mit $aktuelleAttacke für ${schaden.toInt()} an")

            held.loseHp(schaden.toInt())
            //println("Der Held ${held.name} hat noch ${held.hp} Hp übrig")
        } else if (held.hp == 0) {
            println("Attacke kann nicht ausgeführt werden, Held ist Ko")
        }
    }


}
