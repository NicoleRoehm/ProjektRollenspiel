// Todo Mainfunktion klein halten
fun main() {


    println("Herzlich Willkomen :) \n ***Im Rollenspiel RiseOfHeroes***")
    println("-----------------------------------------------------------------------------------")

    // Todo Instanzvariablen
    var guan = Guanyu("guan", 500, 50)
    var cheok = Cheok("Cheok", 650, 60)
    var scipio = Scipio("Scipio", 550, 55)
    var karuak = Endgegner("Karuak", 1500, 90)
    var barbar = Untertanbarbar("Barbar", 400, 30)

    var listeHelden: MutableList<Helden> = mutableListOf(guan, cheok, scipio)
    var listeGegner: MutableList<Gegner> = mutableListOf(karuak, barbar)

    // Todo kampf findet statt
    kampf(guan, cheok, scipio, karuak, barbar, listeHelden, listeGegner)

}




