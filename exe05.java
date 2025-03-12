import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int base, altura;
        double area;
        System.out.println("Digite o valor da base do triângulo: ");
        base = le.nextInt();
        System.out.println("Digite o valor da altura do triângulo: ");
        altura = le.nextInt();
        area = (base * altura) / 2;
        System.out.println("A área do triangulo é: " + area);
        le.close();
    }
}
