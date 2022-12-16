open class Beutel(
    var begrenzt: Int = 3,
    var begrenzt1: Int = 1,
) {

    // Todo Heiltrank erstellen
    open fun heilTrank(helden: Helden): Boolean {
        println("Heiltrank")
        println("Es darf nur 1 pro Runde angewendet werden")
        if (begrenzt > 0) {

            var heilung: Int = 50

            helden.name = readln()
            helden.hp += heilung
            begrenzt -= 1

            println(" ${helden.name} seine Lebendspunkte sind gestiegen und jetzt bei ${helden.hp} Hp")
            println("-----------------------------------------------------------------------------------")
            return true
        }
        return false
    }
    //Todo Vitamine erstellen // Vitamine noch implementieren
    open fun vitamine(gegner: Gegner): Boolean {
        println("vitamine")
        if (begrenzt1 > 0) {

            var vitamin: Int = 350
            gegner.hp -= vitamin
            begrenzt1 - 1

            println("Der Gegner ${gegner.name} hat jetzt nur noch ${gegner.hp} Hp übrig")
            println("-----------------------------------------------------------------------------------")
            return true
        }
        return false
    }
}
