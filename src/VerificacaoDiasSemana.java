import java.util.Scanner;
public class VerificacaoDiasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int semana = 0;
        System.out.println("Digite um número para localizar o dia da semana");
        semana = sc.nextInt();

        switch (semana) {
            case 1:
                System.out.println("segunda-feira");
                break;
            case 2:
                System.out.println("terca-feira");
                break;
            case 3:
                System.out.println("quarta-feira");
                break;
            case 4:
                System.out.println("quinta-feira");
                break;
            case 5:
                System.out.println("sexta-feira");
                break;
            case 6:
                System.out
                        .println("sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("erro");
                break;
        }



    }
}
