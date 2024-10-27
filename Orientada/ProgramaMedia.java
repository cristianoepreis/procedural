package Orientada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();
        
        // Criação da lista de números
        List<Double> numeros = new ArrayList<>();
        
        // Leitura dos números
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextDouble());
        }
        
        // Criação do objeto CalculadoraMedia e cálculo da média
        CalculadoraMedia calculadora = new CalculadoraMedia(numeros);
        double media = calculadora.calcularMedia();
        
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
}
