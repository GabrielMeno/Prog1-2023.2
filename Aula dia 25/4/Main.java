public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[2];
        formas[0] = new Retangulo(5, 7);
        formas[1] = new Circulo(3);

        for (FormaGeometrica forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
        }
    }
}