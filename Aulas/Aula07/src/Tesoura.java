public class Tesoura extends Jogada{
    
    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return jogada instanceof Pedra;
    }

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return jogada instanceof Papel;
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
    
}
