public class retangulo {
    // Classe Retangulo
    // Atributos
    double base;
    double altura;
    double area;
    double perimetro;

    // Método construtor
    public retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    // Métodos próprios
    public void calcularArea() {
        this.area = this.base * this.altura;
    }

    public void calcularPerimetro() {
        this.perimetro = 2 * (this.base + this.altura);
    }

    public void imprimir() {
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}

