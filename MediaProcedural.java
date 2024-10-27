import java.util.Scanner;

public class MediaProcedural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a quantidade de números para calcular a média
        System.out.print("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();
        
        double soma = 0;
        
        // Lê os números e calcula a soma total
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }
        
        // Calcula e exibe a média
        double media = calculaMedia(soma, quantidade);
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
    
    // Função que calcula a média
    public static double calculaMedia(double soma, int quantidade) {
        if (quantidade == 0) return 0;
        return soma / quantidade;
    }
}
