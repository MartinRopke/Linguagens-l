public class Pedra extends Jogada{
    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return jogada instanceof Papel;
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
