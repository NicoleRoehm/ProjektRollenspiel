     // Todo Vererbung einbauen  // Todo Construktor nicht vergessen(PrimärenKonstruktor eingebaut)
open class Guanyu(name: String, hp: Int, level: Int) : Helden(name, hp, level) {

    // Todo Attackenliste
    override var listeAttacke: MutableList<String> = mutableListOf(
        "Heiliger des Krieges",
        "Fünf Tigergeneräle",
        "Sichelklinge des grünen Drachen",
        "Einsamer Reiter",
        "Beutel"
    )
    // Todo Held führt Attacke aus //// Todo auswahl noch ändern
    override fun attackeHelden(gegner: Gegner) {
        println("Suche dir eine Attacke aus $listeAttacke \nSchreibe sie selbst richtig auf!")
        println("-----------------------------------------------------------------------------------")
        var attack = readln()

        var check = attack in listeAttacke
        if (check) {

            if (!this.isKo && !gegner.istKo) {

                var schaden: Double = this.schadenswerte

                when (attack) {
                    "Heiliger des Krieges" -> {
                        schaden = 1.3 * schadenswerte
                    }

                    "Fünf Tigergeneräle" -> {
                        schaden = 2.1 * schadenswerte
                    }

                    "Sichelklinge des grünen Drachen" -> {
                        schaden = 1.5 * schadenswerte
                    }

                    "Einsamer Reiter" -> {
                        schaden = 2.3 * schadenswerte
                    }

                    "Beutel" -> {

                        Beutel().heilTrank(Helden(name, hp, level))
                    }

                }

                if (attack != "Beutel") {


                    println("${this.name} greift ${gegner.name} mit --- $attack --- für ${schaden.toInt()} an")
                    gegner.hpLose(schaden.toInt())
                    println("-----------------------------------------------------------------------------------")
                    println("Der Gegner ${gegner.name} hat noch ${gegner.hp} Hp übrig")
                    println("-----------------------------------------------------------------------------------")
                }
            } else if (gegner.hp == 0) {
                println("Attacke kann nicht ausgeführt werden, gegner ist Ko")
            }
        } else {
            println("Fasche Eingabe!!!! bitte Wiederholen")
            println("-----------------------------------------------------------------------------------")
            attackeHelden(gegner)
        }
    }
}
