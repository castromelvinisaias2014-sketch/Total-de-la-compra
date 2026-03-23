/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularpromediotarea14;

/**
 *
 * @author Melvin
 */
public class CalcularPromedioTarea14 {

    /**
     * @param args the command line arguments
     */
    // Función con parámetros y retorno
    public static double calcularPromedio(double n1, double n2, double n3) {
        double promedio = (n1 + n2 + n3) / 3;
        return promedio; // retorna el resultado
    }

    public static void main(String[] args) {
        double nota1 = 5.5;
        double nota2 = 7.0;
        double nota3 = 9.0;

        // Llamada a la función
        double resultado = calcularPromedio(nota1, nota2, nota3);

        // Mostrar resultado
        System.out.println("El promedio es: " + resultado);
    }
}
    
    

