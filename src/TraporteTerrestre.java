public class TraporteTerrestre implements Transporte {
    @Override
    public boolean podeTransportar(Encomenda encomenda, Localizacao destino) {
        return destino.isLocal(); // Apenas transportes locais
    }

    @Override
    public void realizarTransporte(Encomenda encomenda, Localizacao destino) {
        System.out.println("Transportando por via terrestre com transportadora local.");
    }
}






