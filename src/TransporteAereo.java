public class TransporteAereo implements Transporte {
    @Override
    public boolean podeTransportar(Encomenda encomenda, Localizacao destino) {
        return encomenda.getPeso() <= 50 && encomenda.getDimensao() <= 100; // Regras específicas
    }

    @Override
    public void realizarTransporte(Encomenda encomenda, Localizacao destino) {
        System.out.println("Transportando por via aérea.");
    }
}