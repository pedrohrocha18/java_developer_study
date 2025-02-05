package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao01 {
    public static void main(String[] args) {
        // while
        int contador = 0;

        while (contador < 10) {
            contador += 1;
            System.out.println(contador);
        }

        // do while
        contador = 0;
        do {
            contador += 1;
            System.out.println("Opa!" + contador);
        } while (contador < 10);


        // for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
