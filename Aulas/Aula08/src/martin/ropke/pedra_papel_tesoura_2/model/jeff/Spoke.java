package martin.ropke.pedra_papel_tesoura_2.model.jeff;

import martin.ropke.pedra_papel_tesoura_2.model.Jogada;
import martin.ropke.pedra_papel_tesoura_2.model.classico.Papel;
import martin.ropke.pedra_papel_tesoura_2.model.classico.Pedra;
import martin.ropke.pedra_papel_tesoura_2.model.classico.Tesoura;

public class Spoke extends Jogada {

    @Override
    public Jogada[] jogadasQueGanhei() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }
   
    @Override
    public Jogada[] jogadasQuePerdi() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Spoke";
    }
    
}
