package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {
        // !

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida!");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não pode comprar bebida!");
        }
        System.out.println("Fora do if.");
    }
}
