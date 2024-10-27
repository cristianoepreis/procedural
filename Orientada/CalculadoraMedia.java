package Orientada;
import java.util.List;

public class CalculadoraMedia {
    private List<Double> numeros;

    // Construtor que recebe a lista de números
    public CalculadoraMedia(List<Double> numeros) {
        this.numeros = numeros;
    }

    // Método para calcular a média
    public double calcularMedia() {
        if (numeros.isEmpty()) return 0;
        
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.size();
    }
}

