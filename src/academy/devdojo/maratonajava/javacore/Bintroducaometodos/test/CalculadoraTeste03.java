package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 0);

        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(10, 0));
        System.out.println("--------");
        calculadora.imprimeDivisaoDeDoisNumeros(10, 0);

    }
}
