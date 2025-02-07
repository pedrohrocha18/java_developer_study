package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTeste0 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1 = carro2;

        carro1.nome = "Virtus";
        carro1.modelo = "Confortline TSI";
        carro1.ano = 2025;

        carro2.nome = "Nivus";
        carro2.modelo = "Confortline TSI";
        carro2.ano = 2025;

        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
