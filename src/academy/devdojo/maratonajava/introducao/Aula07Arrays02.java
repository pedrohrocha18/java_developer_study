package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[4];

        nomes[0] = "Lord Voldemort";
        nomes[1] = "Harry Potter";
        nomes[2] = "Hermione";
        nomes[3] = "Severus Snape";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
