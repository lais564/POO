public class principalquadrado {
    public static void main(String[] args) {
        // Criando um objeto da classe quadrado
        quadrado q1 = new quadrado(5.0); // lado = 5

        // Calculando o perímetro (a área já é calculada no construtor)
        q1.calcularperimetro();

        // Imprimindo os resultados
        q1.imprimir();
    }
}