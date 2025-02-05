package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicional05 {
    public static void main(String[] args) {
        // imprima o dia da semana considerando 1 como domingo

        int diaDaSemana = 3;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }

        char sexo = 'm';

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }
}
