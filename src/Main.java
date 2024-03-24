import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura : ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("Seu IMC é: " + imc);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
