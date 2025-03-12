import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        double far, cel;
        System.out.println("Digite a temperatura em Celsius: ");
        cel = le.nextDouble();
        far = cel * 1.38 + 32;
        System.out.println("A temperatura em Fahrenheit é: " + far);
        le.close();
    }
}
