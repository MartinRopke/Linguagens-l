package dao

interface GenericoDAO {
    fun pegarUm(id:Int): Any;
    fun pegarTodos(): List<Any>;
    fun inserirUm(Obejto : Any): Unit;
    fun inserirVarios(lista: List<Any>) : Unit;
    fun atualizar(obejto: Any) : Unit;
    fun deletar(id: Int) : Unit;

}