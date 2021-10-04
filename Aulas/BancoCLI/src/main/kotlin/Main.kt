import dao.ProdutoDAO

fun main() {
    //Cria um DAO para os produtos
    val produtosDAO = ProdutoDAO()
    val produtos = produtosDAO.pegarTodosSeguro()
    //Itera pelo resultado obtido
    for(produto in produtos){
        println(produto)
    }
}