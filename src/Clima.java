import java.util.Scanner;
public class Clima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura = 0;

        System.out.println("digite a temperatura: ");
        temperatura = sc.nextDouble();

        if (temperatura >30) {
            System.out.println(" quentee!");
        }
        else if (temperatura >15 && temperatura <=30) {
            System.out.println(" agradável");
        }
        else if (temperatura <15){
            System.out.println("frio");
        }
    }
}
