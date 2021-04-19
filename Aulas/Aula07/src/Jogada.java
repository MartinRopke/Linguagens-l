public class Jogada {
    private Jogada venco;
    private Jogada perco;
    
    public Resultado verificarResultado(Jogada jogada) {
        if(verificarSeGanhei(jogada)){
            return Resultado.GANHOU;
        }
        if(verificarSePerdi(jogada)){
            return Resultado.PERDEU;
        }
        return Resultado.EMPATOU;
    }

    public boolean verificarSePerdi(Jogada jogada){
        return true;
    }

    public boolean verificarSeGanhei(Jogada jogada){
        return true;
    }
    
}
