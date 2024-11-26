public class TransportePorDrone implements Transporte {
    @Override
    public boolean podeTransportar(Encomenda encomenda, Localizacao destino) {
        return destino.isMetropolitana() && encomenda.getPeso() <= 2; // Regras específicas
    }

    @Override
    public void realizarTransporte(Encomenda encomenda, Localizacao destino) {
        System.out.println("Transportando por drone.");
    }
}