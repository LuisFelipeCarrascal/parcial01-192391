import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        
        System.out.println("Introduce números enteros (escribe 'fin' para terminar):");
        
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número entero válido.");
            }
        }

        if (!numeros.isEmpty()) {
            double promedio = calcularPromedio(numeros);
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se han ingresado números.");
        }
        
        scanner.close();
    }

    private static double calcularPromedio(List<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.size();
    }
}
