import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        double alt, peso, imc;
        System.out.println("Digite a sua altura em metros: ");
        alt = le.nextDouble();
        System.out.println("Digite o seu peso em kg: ");
        peso = le.nextDouble();
        imc = peso / (alt * alt);
        System.out.println("O seu IMC é: " + imc);
        le.close();
    }
}
