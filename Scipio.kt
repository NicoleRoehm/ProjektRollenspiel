//Todo Vererbung einbauen //Todo Construktor nicht vergessen(PrimärenKonstruktor eingebaut)
open class Scipio(name: String, hp: Int, level: Int) : Helden(name, hp, level) {

    // Todo Attackenliste
    override var listeAttacke: MutableList<String> =
        mutableListOf(
            "Unvergleichliche Stärke",
            "Alles beherrschend",
            "Schildkrötenformation",
            "Feurige Rage",
            "Beutel"
        )

   // Todo Held führt Attacke aus // Todo auswahl noch ändern

    override fun attackeHelden(gegner: Gegner) {
        println("Suche dir eine Attacke aus $listeAttacke \n Schreibe sie selbst richtig auf")
        println("-----------------------------------------------------------------------------------")
        var attack = readln()
        var check = attack in listeAttacke
        if (check) {

            if (!this.isKo && !gegner.istKo) {

                var schaden: Double = this.schadenswerte

                when (attack) {
                    "Unvergleichliche Stärke" -> {
                        schaden = 0.5 * schadenswerte
                    }

                    "Alles beherrschend" -> {
                        schaden = 0.6 * schadenswerte
                    }

                    "Schildkrötenformation" -> {
                        schaden = 0.30 * schadenswerte
                    }

                    "Feurige Rage" -> {
                        schaden = 2.7 * schadenswerte
                    }

                    "Beutel" -> {
                        Beutel().heilTrank(Helden(name, hp, level))
                    }
                }
                when (gegner.name) {

                    "Schildkrötenformation" -> {
                        schaden *= 5.5
                    }

                }
                if (attack != "Beutel" && attack != "Beutel1") {
                    println("${this.name} greift ${gegner.name} mit --- $attack --- für ${schaden.toInt()} an")
                    println("-----------------------------------------------------------------------------------")
                    gegner.hpLose(schaden.toInt())
                    println("Der Gegner ${gegner.name} hat noch ${gegner.hp} Hp übrig")
                    println("-----------------------------------------------------------------------------------")
                }
            } else if (gegner.hp == 0) {
                println("Attacke kann nicht ausgeführt werden, Gegner ist Ko")
            }
        } else {
            println("Falsche Eingabe!! bitte Wiederholen")
            println("-----------------------------------------------------------------------------------")
            attackeHelden(gegner)
        }
    }
}
