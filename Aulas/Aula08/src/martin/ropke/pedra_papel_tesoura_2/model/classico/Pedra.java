package martin.ropke.pedra_papel_tesoura_2.model.classico;

import martin.ropke.pedra_papel_tesoura_2.model.Jogada;

public class Pedra extends Jogada{
    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return jogada instanceof Papel;
    }

    @Override
    public Jogada[] jogadasaQueGanhei() {
        return new Jogada[]{new Lagarto(), };
    }

    @Override
    public Jogada[] jogadasaQuePerdi() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return jogada instanceof Tesoura;
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
