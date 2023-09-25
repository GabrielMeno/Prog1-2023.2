import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe as coordenadas do primeiro ponto (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.println("Informe as coordenadas do segundo ponto (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distancia = calcularDistancia(x1, y1, x2, y2);
        
        System.out.println("A distância Euclidiana entre os dois pontos é: " + distancia);
    }
    
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
