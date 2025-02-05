package academy.devdojo.maratonajava.introducao;

// idade < 15 -> categoria infantil
// idade >= 15 e idade < 18 -> categoria juvenil
//idade >= 18 -> categoria adulto

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {

        int idadeJogador = 16;
        String categoria = "";

        if (idadeJogador < 15) {
            categoria = "Categoria Infantil";
        } else if (idadeJogador >= 15 && idadeJogador < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
