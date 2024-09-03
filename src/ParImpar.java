import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Integer numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println(" É par!");
        }else {
            System.out.println("É impar!");
        }
    }
}
