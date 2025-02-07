package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.ImprimirDadosEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimirDadosEstudante impressora = new ImprimirDadosEstudante();

        estudante01.nome = "Pedro";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Adrielle";
        estudante02.idade = 26;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("------------");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
