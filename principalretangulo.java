import java.util.Scanner;

public class principalretangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = teclado.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = teclado.nextDouble();

        // Cria o objeto Retangulo
        retangulo r1 = new retangulo(base, altura);

        // Exibe os resultados
        r1.imprimir();

        teclado.close();
    }
}