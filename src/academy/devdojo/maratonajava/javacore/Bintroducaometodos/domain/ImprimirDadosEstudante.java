package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class ImprimirDadosEstudante {
    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("--------");

        estudante.nome = "Gohan";
    }
}
