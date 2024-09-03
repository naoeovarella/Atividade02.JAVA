import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioBruto = 0.0;
        int anosTrabalhados = 0;
        double percentualBonus = 0.0;
        double percentualImposto = 0.0;
        double salarioLiquido = 0.0;
        double valorBonus = 0.0;
        double valorImposto = 0.0;

        System.out.println("Olá, informe-nos o salário bruto do funcionário: ");
        salarioBruto = sc.nextDouble();
        System.out.println("Agora nos diga, por quantos anos ele trabalhou pela empresa: ");
        anosTrabalhados = sc.nextInt();

        if (anosTrabalhados > 10) {
            percentualBonus = 10;
        } else if (anosTrabalhados >= 5 && anosTrabalhados <= 10) {
            percentualBonus = 5;
        } else {
            percentualBonus = 0;
        }

        if (salarioBruto > 5000) {
            percentualImposto = 27;
        } else if (salarioBruto >= 3000 && salarioBruto <= 4999.99) {
            percentualImposto = 18;
        } else {
            percentualImposto = 10;
        }

        valorBonus = (percentualBonus / 100) * salarioBruto;
        valorImposto = (percentualImposto / 100) * salarioBruto;

        salarioLiquido = salarioBruto + valorBonus - valorImposto;

        System.out.println("O salário bruto é: R$ " + salarioBruto);
        System.out.println("O bônus recebido é: R$ " + valorBonus);
        System.out.println("O imposto descontado é: R$ " + valorImposto);
        System.out.println("O salário líquido é: R$ " + salarioLiquido);

    }
}
