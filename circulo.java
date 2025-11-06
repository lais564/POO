public class circulo {
    // Atributos
    private double raio;
    private double area;
    private double perimetro;

    // Construtor
    public circulo(double raio) {
        this.raio = raio;
        calcularArea();
        calcularPerimetro();
    }

    // Métodos para calcular área e perímetro
    private void calcularArea() {
        this.area = Math.PI * Math.pow(raio, 2);
    }

    private void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * raio;
    }

    // Métodos para acessar os valores
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    // Método principal (main)
    public static void main(String[] args) {
        circulo c = new circulo(5); // exemplo com raio 5
        System.out.println("Área: " + c.getArea());
        System.out.println("Perímetro: " + c.getPerimetro());
    }
}
    

