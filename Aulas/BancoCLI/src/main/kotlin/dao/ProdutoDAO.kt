package dao

import models.Produto
import java.sql.DriverManager
import shared.SharedPaths

class ProdutoDAO : GenericoDAO {
    override fun pegarUm(id: Int): Any {
        //Cria uma conexão com o banco
        val connection = DriverManager.getConnection(SharedPaths.STRING_DE_CONEXAO_JDBC)
        //Cria um caminho para realizar queries s1l no banco
        val sqlStatement = connection.createStatement()
        //Executa uma query de busca
        val resultSet = sqlStatement.executeQuery("SELECT * FROM produtos WHERE id == $id;")
        //Itera pelo resultado obtido
        var produto: Produto? = null
        while(resultSet.next()){
                produto = Produto(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getInt("quantidade")
            )
        }
        resultSet.close()
        connection.close()
        return produto!!
    }

    override fun pegarTodos(): List<Any> {
        //Cria uma conexão com o banco
        val connection = DriverManager.getConnection("jdbc:sqlite:meuBanco.db")
        //Cria um caminho para realizar queries s1l no banco
        val sqlStatement = connection.createStatement()
        //Executa uma query de busca
        val resultSet = sqlStatement.executeQuery("SELECT * FROM produtos")
        //Itera pelo resultado obtido
        val produtos = mutableListOf<Produto>()
        while(resultSet.next()){
            produtos.add(Produto(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getInt("quantidade")
            ))
        }
        resultSet.close()
        connection.close()
        return produtos
    }

    fun pegarTodosSeguro() : List<Any>{
        val produtos = mutableListOf<Produto>()
        var connection : ConnectionDAO? = null
        try {
            //Cria uma conexão com o banco
            connection = ConnectionDAO()
            val resultSet = connection.executeQuery("SELECT * FROM produtos")
            //Itera pelo resultado obtido
            while (resultSet?.next()!!) {
                produtos.add(
                    Produto(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getDouble("valor"),
                        resultSet.getInt("quantidade")
                    )
                )
            }
            connection.close()
        }catch (exception: Exception){
            exception.printStackTrace()
        }finally {
            connection?.close()
        }
        return produtos
    }

    override fun inserirUm(Obejto: Any) {
        val connectionDAO = ConnectionDAO()
        val preparedStatement = connectionDAO.getPreparedStatement("INSER INTO produtos nome, valoor , quantidade VALUES ();".trimMargin())
    }

    override fun inserirVarios(lista: List<Any>) {
        TODO("Not yet implemented")
    }

    override fun atualizar(obejto: Any) {
        TODO("Not yet implemented")
    }

    override fun deletar(id: Int) {
        TODO("Not yet implemented")
    }
}