     // Todo Funktionen kampf erstellen
var beutel: Beutel = Beutel()
fun kampf(
    guan: Helden,
    cheok: Helden,
    scipio: Helden,
    karuak: Gegner,
    barbar: Gegner,
    listeHelden: MutableList<Helden>,
    listegegner: MutableList<Gegner>,
) {
    // Todo Punktnation in eine While Schleife gepackt mit einer If/else Verzweigung
    while (!guan.isKo && !karuak.istKo) {


        if (guan.listeAttacke == karuak.listeAttacken) {

            guan.attackeHelden(listegegner.random())
            cheok.attackeHelden(listegegner.random())
            scipio.attackeHelden(listegegner.random())
            karuak.attackeGegner(listeHelden.random(), listegegner)
            barbar.attackeGegner(listeHelden.random(), listegegner)

        } else if (!barbar.istKo && !cheok.isKo) {
            guan.attackeHelden(listegegner.random())
            cheok.attackeHelden(listegegner.random())
            scipio.attackeHelden(listegegner.random())
            karuak.attackeGegner(listeHelden.random(), listegegner)
            barbar.attackeGegner(listeHelden.random(), listegegner)
        } else if (barbar.istKo && !karuak.istKo) {

            guan.attackeHelden(karuak)
            cheok.attackeHelden(karuak)
            scipio.attackeHelden(karuak)
            karuak.attackeGegner(listeHelden.random(), listegegner)

        } else (println("Spiel ist vorüber"))

    }


    if (guan.isKo && !karuak.istKo) {
        println(" ${karuak.name} hat ${guan.name} besiegt")
        listeHelden.remove(guan)

        if (cheok.isKo && !karuak.istKo) {
            println(" ${karuak.name} hat ${cheok.name} besiegt")
            listeHelden.remove(cheok)
        }
        if (scipio.isKo && !karuak.istKo) {
            println(" ${karuak.name} hat ${scipio.name} besiegt")
            listeHelden.remove(scipio)
        } else if (karuak.istKo && !guan.isKo) {
            println(" ${guan.name} hat ${karuak.name} besiegt")
        }
        if (karuak.istKo && !cheok.isKo) {
            println(" ${cheok.name} hat ${karuak.name} besiegt")


        } else if (karuak.istKo && !scipio.isKo) {
            println(" ${scipio.name} hat ${karuak.name} besiegt")
        }

    } else {
        println("Spiel ist vorbei")
    }
}

