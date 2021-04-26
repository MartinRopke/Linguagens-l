package martin.ropke.pedra_papel_tesoura_2.model.classico;

import martin.ropke.pedra_papel_tesoura_2.model.Jogada;
import martin.ropke.pedra_papel_tesoura_2.model.jeff.Lagarto;
import martin.ropke.pedra_papel_tesoura_2.model.jeff.Spoke;

public class Papel extends Jogada{
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) ||  (jogada instanceof Spoke);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Tesoura) ||  (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
