public interface Transporte {
    boolean podeTransportar(Encomenda encomenda, Localizacao destino);
    void realizarTransporte(Encomenda encomenda, Localizacao destino);
}
