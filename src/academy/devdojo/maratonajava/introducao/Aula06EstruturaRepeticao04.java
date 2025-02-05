package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele por ser parcelado;
        // Condição: valor parcela >= 1000;

        double valorDoCarro = 42589.14;

        for (int parcela = 10; parcela <= valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;

            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " " + valorParcela);
            } else {
                break;
            }
        }
    }
}
