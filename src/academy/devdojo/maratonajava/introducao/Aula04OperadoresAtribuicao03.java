package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresAtribuicao03 {
    public static void main(String[] args) {
        // =  += -= *= /= %=

        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; //1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --

        int contador = 0;
        contador++; // 1
        contador--; // 0
        System.out.println(contador);

    }
}
