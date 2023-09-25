import java.util.Scanner;

public class InverterDs    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        int numero = scanner.nextInt();
        
        int numeroInvertido = InverterDigitos(numero);
        
        System.out.println("O número com dígitos invertidos é: " + numeroInvertido);
    }
    
    public static int InverterDigitos(int numero) {
        int numeroInvertido = 0;
        
        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }
        
        return numeroInvertido;
    }
}
