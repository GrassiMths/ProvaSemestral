public class Main {
    public static void main(String[] args) {

        System.out.println("=== Especificações de Transporte ===");

        System.out.printf("%n%-25s: Peso Máximo: %s | Dimensão Máxima: %s | Regiões: %s | Restrição: %s%n",
                "Transporte Terrestre",
                "Sem limite",
                "Sem limite",
                "Local",
                "Transportadora local requerida");

        System.out.printf("%n%-25s: Peso Máximo: %s | Dimensão Máxima: %s | Regiões: %s | Restrição: %s%n",
                "Transporte Aéreo",
                "50 kg",
                "100 cm",
                "Nacional e Internacional",
                "Respeitar peso e dimensões");

        System.out.printf("%n%-25s: Peso Máximo: %s | Dimensão Máxima: %s | Regiões: %s | Restrição: %s%n",
                "Transporte Marítimo",
                "Sem limite",
                "Sem limite",
                "Apenas Internacional",
                "Somente entregas internacionais");

        System.out.printf("%n%-25s: Peso Máximo: %s | Dimensão Máxima: %s | Regiões: %s | Restrição: %s%n",
                "Transporte por Drone",
                "2 kg",
                "30 cm",
                "Áreas Metropolitanas",
                "Somente pacotes pequenos\n");

        Encomenda encomenda = new Encomenda(40, 100);
        Localizacao destino = new Localizacao(false, true, false);

        GerenciadorTransporte gerenciador = new GerenciadorTransporte();
        gerenciador.selecionarETransportar(encomenda, destino);


    }
}
