import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        double far, cel;
        System.out.println("Digite a temperatura em Fahrenheit: ");
        far = le.nextDouble();
        cel = (far - 32) * 5 / 9;
        System.out.println("A temperatura em Celsius é: " + cel);
        le.close();
    }
}
