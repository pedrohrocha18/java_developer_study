package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores2 {
    public static void main(String[] args) {
        // &&   ||

        int idade = 29;
        double salario = 3500.80;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorContaCorrente = 200.40;
        double valorContaPoupanca = 12000.43;
        double valorPS5 = 5000;
        boolean isPS5Compravel = valorContaCorrente >= valorPS5 || valorContaPoupanca >= valorPS5;

        System.out.println("isPS5Compravel " + isPS5Compravel);
    }
}
