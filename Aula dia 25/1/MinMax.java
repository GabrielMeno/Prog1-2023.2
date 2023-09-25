import java.util.Scanner;

public class MinMax{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de números:");
        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }
        
        int menor = encontrarMenor(numeros);
        int maior = encontrarMaior(numeros);
        
        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);
        System.out.println("O primeiro número é: " + numeros[0]);
        System.out.println("O último número é: " + numeros[numeros.length - 1]);
    }
    
    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        
        return menor;
    }
    
    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];
        
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        
        return maior;
    }
}
