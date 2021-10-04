import khttp.structures.authorization.BasicAuthorization

fun main(args: Array<String>) {
    val resposta = khttp.get("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
    val baralho_id = resposta.jsonObject["deck_id"]
    val cards_reposta = khttp.get("https://deckofcardsapi.com/api/deck/$baralho_id/draw/?count=1")
    val valor_carta = cards_reposta.jsonObject["cards"]
    println(valor_carta)





}