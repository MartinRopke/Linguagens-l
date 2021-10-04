import dao.ProdutoDAO
import models.Produto
import java.sql.DriverManager

fun main() {
    //Cria um DAO para os produtos
    val produtosDAO = ProdutoDAO()
    val produtos = produtosDAO.pegarTodos()
    //Itera pelo resultado obtido
    for(produto in produtos){
        println(produto)
    }
}