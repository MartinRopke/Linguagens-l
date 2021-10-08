package dao

import shared.SharedPaths
import java.sql.*
import javax.swing.text.html.HTMLDocument

class ConnectionDAO {
    val connection : Connection
    var statement : Statement?
    var resultSet : ResultSet?
    var preparedStatement : PreparedStatement?

    init {
        this.connection = DriverManager.getConnection(SharedPaths.STRING_DE_CONEXAO_JDBC)
        this.resultSet = null
        this.statement = null
        this.preparedStatement = null
    }

    fun executeQuery(sqlString: String) : ResultSet? {
        this.statement = this.connection.createStatement()
        this.resultSet = this.statement?.executeQuery(sqlString)
        return this.resultSet
    }

    fun close(){
        this.connection.close()
        this.statement?.close()
        this.resultSet?.close()
        this.preparedStatement?.close()
    }

    fun getPreparedStatement(slqString: String): PreparedStatement? {
        this.preparedStatement = this.connection.prepareStatement(slqString)
        return this.preparedStatement
    }

    fun commit() {
        this.connection.commit()
    }
}