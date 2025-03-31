import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = ler.nextInt();

        int resultado = soma(n1, n2);
        int resultado2 = sub(n2, n1);
        int resultado3 = mul(n1, n2);
        int resultado4 = div(n2, n1);
        System.out.println("A soma é: " + resultado);
        System.out.println("A sub é: " + resultado2);
        System.out.println("A mul é: " + resultado3);
        System.out.println("A div é: " + resultado4);




    }

    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

    public static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int mul(int n1, int n2) {
        return n1 * n2;
    }

    public static int div(int n1, int n2) {
        return n1 / n2;
    }

}
