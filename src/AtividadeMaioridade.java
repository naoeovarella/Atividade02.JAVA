import java.util.Scanner;
public class AtividadeMaioridade {

    public class VerificaçãodeMaioridade {
        public static void main(String[] args) {
            Integer idade = 0;
            Scanner scaner = new Scanner(System.in);
            System.out.println("Digite a idade: ");
            idade = scaner.nextInt();
            if (idade >= 18) {
                System.out.println("É maior de idade");
            }
            if (idade < 18) {
                System.out.println("É menor de idade");
            }

        }
    }
}
