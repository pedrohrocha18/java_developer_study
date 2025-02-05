package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao02 {
    public static void main(String[] args) {
        // imprimir números pares de 0 a 1000000

        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
