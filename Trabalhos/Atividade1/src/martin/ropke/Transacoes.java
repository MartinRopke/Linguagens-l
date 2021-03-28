package martin.ropke;

import java.util.Random;


public class Transacoes {

public static String geradorQR(int id, Usuario usuario, double valor){

    //Pega número aleatorio entre 1000 e 9999
    int random = getRandomNumberInRange(); 

    //cria String juntando os dados com ponto virgula entre eles
    String qrCode = String.join(";", id + "", usuario.getNome(), valor+"", random+"");
    return qrCode;
}

//gera um número aleatório entre 1000 e 9999
private static int getRandomNumberInRange() {
    Random r = new Random();
    return r.nextInt((9999 - 1000) + 1) + 1000;
    }
    


public void Pagamento(){
        
}
    
}
