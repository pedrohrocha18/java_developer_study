package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicional04 {
    public static void main(String[] args) {
        double annualSalary = 47000;
        double tax01 = 9.70 / 100;
        double tax02 = 9.70 / 100;
        double tax03 = 9.70 / 100;
        double valorDoImposto;

        if (annualSalary <= 34712) {
            valorDoImposto = annualSalary * tax01;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            valorDoImposto = annualSalary * tax02;
        } else {
            valorDoImposto = annualSalary * tax03;
        }
        double salarioDescontoImposto = annualSalary - valorDoImposto;

        System.out.println("Valor do imposto a ser pago: R$" + valorDoImposto);
        System.out.println("------------");
        System.out.println("Valor final do salário: R$" + salarioDescontoImposto);
    }
}
