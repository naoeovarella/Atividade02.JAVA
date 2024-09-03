import java.util.Scanner;
public class VerificacaoLogin {
    public static void main(String[] args) {
        String usuarioCorreto = "admin";
        String senhaCorreta = "admin";
        Scanner entrada = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuarioInserido = entrada.nextLine();

        System.out.print("Senha: ");
        String senhaInserida = entrada.nextLine();
        if (usuarioInserido.equals(usuarioCorreto) && senhaInserida.equals(senhaCorreta)) {
            System.out.println("Login bem sucedido!");
        } else {
            System.out.println("Tente novamente.");
        }

    }
}
