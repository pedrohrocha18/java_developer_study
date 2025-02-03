package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *

        int number01 = 20;
        int number02 = 30;

        int result = number01 + number02;

        System.out.println(result);
        System.out.println("-----------------");


        // %

        int rest = 21 % 2;
        System.out.println(rest);

        // <  >   <=  >=   == !=

        boolean isDoisMaiorQueDez = 2 > 10; //false
        boolean isDoisMenorDeDez = 2 < 3; // true
        boolean isDoisMaiorIgualDez = 2 >= 10; // false
        boolean isDoisMenorIgualDez = 2 <= 10; // true
        boolean isDoisIgualDez = 2 == 10; // false
        boolean isDoisDiferenteDeDez = 2 != 10; // true

        System.out.println("isDoisMaiorQueDez " + isDoisMaiorQueDez);
        System.out.println("isDoisMenorDeDez " + isDoisMenorDeDez);
        System.out.println("isDoisMaiorIgualDez " + isDoisMaiorIgualDez);
        System.out.println("isDoisMenorIgualDez " + isDoisMenorIgualDez);
        System.out.println("isDoisIgualDez " + isDoisIgualDez);
        System.out.println("isDoisDiferenteDeDez " + isDoisDiferenteDeDez);

    }
}
