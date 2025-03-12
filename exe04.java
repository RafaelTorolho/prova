import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int num, numQuad, numCubo;
        System.out.println("Digite um número inteiro: ");
        num = le.nextInt();
        numQuad = num * num;
        numCubo = num * num * num;
        System.out.println("O quadrado de " + num + " é: " + numQuad);
        System.out.println("O cubo de " + num + " é: " + numCubo);
        le.close();
    }
}