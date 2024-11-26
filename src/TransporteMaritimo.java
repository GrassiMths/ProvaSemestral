public class TransporteMaritimo implements Transporte {
    @Override
    public boolean podeTransportar(Encomenda encomenda, Localizacao destino) {
        return destino.isInternacional(); // Apenas transportes internacionais
    }

    @Override
    public void realizarTransporte(Encomenda encomenda, Localizacao destino) {
        System.out.println("Transportando por via marítima.");
    }
}