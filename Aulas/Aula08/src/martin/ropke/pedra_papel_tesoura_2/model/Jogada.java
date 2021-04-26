package martin.ropke.pedra_papel_tesoura_2.model;

import martin.ropke.pedra_papel_tesoura_2.enumarecao.Resultado;

public abstract class Jogada {
    final public Resultado verificarResultado(Jogada jogada) {
        if(verificarSeGanhei(jogada)){
            return Resultado.GANHOU;
        }
        if(verificarSePerdi(jogada)){
            return Resultado.PERDEU;
        }
        return Resultado.EMPATOU;
    }

    final private boolean verificarSePerdi(Jogada jogada){
        for(Jogada jogadaAtual : jogadasQuePerdi()){
            if(jogadaAtual.getClass() == jogada.getClass()){
                return true;
            }
        }
        return false;
    }

    final private boolean verificarSeGanhei(Jogada jogada){
        for(Jogada jogadaAtual : jogadasQueGanhei()){
            if(jogadaAtual.getClass() == jogada.getClass()){
                return true;
            }
        }
        return false;
    }
    public abstract Jogada[] jogadasQueGanhei();
    public abstract Jogada[] jogadasQuePerdi();
}
