import java.util.ArrayList;
import java.util.List;

public class GerenciadorTransporte {
    private final List<Transporte> transportesDisponiveis = new ArrayList<>();

    public GerenciadorTransporte() {
        // Adicionar os transportes disponíveis
        transportesDisponiveis.add(new TraporteTerrestre());
        transportesDisponiveis.add(new TransporteAereo());
        transportesDisponiveis.add(new TransporteMaritimo());
        transportesDisponiveis.add(new TransportePorDrone());
    }

    public void selecionarETransportar(Encomenda encomenda, Localizacao destino) {
        for (Transporte transporte : transportesDisponiveis) {
            if (transporte.podeTransportar(encomenda, destino)) {
                transporte.realizarTransporte(encomenda, destino);
                return;
            }
        }
        throw new IllegalArgumentException("Nenhum transporte disponível para esta encomenda e destino.");
    }
}
