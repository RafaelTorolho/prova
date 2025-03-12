import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int a, b, c, delta;
        System.out.println("Digite o valor de A: ");
        a = le.nextInt();
        System.out.println("Digite o valor de B: ");
        b = le.nextInt();
        System.out.println("Digite o valor de C: ");
        c = le.nextInt();
        delta = (b * b) - (4 * a * c);
        System.out.println("O valor de delta é: " + delta);
        le.close();
    }
}
