    //  Todo Vererbung einbauen  // Todo Construktor nicht vergessen(PrimärenKonstruktor eingebaut)
open class Cheok(name: String, hp: Int, level: Int) : Helden(name, hp, level) {

    // Todo Liste Attacke
    override var listeAttacke: MutableList<String> =
        mutableListOf("Mutig", "Byeolmuban", "Standhaft", "Schwur bis zum Tod", "Beutel")

    // Todo Held führt die Attacke aus // Todo auswahl noch ändern
    override fun attackeHelden(gegner: Gegner) {
        println("Suche dir eine Attacke aus $listeAttacke \n Schreibe sie selbst richtig auf!")
        println("-----------------------------------------------------------------------------------")
        var attack = readln()
        var check = attack in listeAttacke
        if (check) {

            if (!this.isKo && !gegner.istKo) {

                var schaden: Double = this.schadenswerte

                when (attack) {

                    "Mutig" -> {
                        schaden = 2.5 * schadenswerte * 2.5
                    }

                    "Byeolmuban" -> {
                        schaden = 0.46 * schadenswerte * 1.5
                    }

                    "Standhaft" -> {
                        schaden = 0.5 * schadenswerte * 2.9
                    }

                    "Schwur bis zum Tod" -> {
                        schaden = 2.1 * schadenswerte * 3.8
                    }

                    "Beutel" -> {
                        Beutel().heilTrank(Helden(name, hp, level))
                    }

                }
                // Todo wenn Beutel ausgewählt wird, werden die Println´´ nicht angezeigt
                if (attack != "Beutel") {
                    println("${this.name} greift ${gegner.name} mit ---" +
                            "$attack ---für ${schaden.toInt()} an")
                    gegner.hpLose(schaden.toInt())
                    println("Der Gegner ${gegner.name} hat noch ${gegner.hp} Hp übrig")
                    println("-----------------------------------------------------------------------------------")
                }
            } else if (gegner.hp <= 0) {
                println("Attacke kann nicht ausgeführt werden, gegner ist Ko")

            }
        } else {
            println("Falsche Eingabe!!!!! \n Bitte Wiederholen")
            println("-----------------------------------------------------------------------------------")
            attackeHelden(gegner)
        }
    }
}