import java.util.Scanner;
public class ClassificacaoNotas {
    public static void main(String[] args) {
        Double nota = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        nota = sc.nextDouble();
        if (nota >= 9.0) {
            System.out.println("Excelente");
        } else if (nota >= 7.0) {
            System.out.println("Bom");
        } else if (nota >= 5.0) {
            System.out.println("Satisfatório");
        } else if (nota < 5.0) {
            System.out.println(" Insatisfatório");
        }
    }
}
