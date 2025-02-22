package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicional06 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        int diaDaSemana = 1;

        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }

    }
}
