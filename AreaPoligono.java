import java.util.Scanner;
public class AreaPoligono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("seleccione el poligono");
        System.out.println("1 para triangulo");
        System.out.println("2 para Cuadrado");
        System.out.println("3 para rectangulo");
        int seleccion = scanner.nextInt();
        System.out.println("ingrese la base y la altura");
        double base = scanner.nextInt();
        double altura = scanner.nextInt();
        
        switch (seleccion) {
            case 1:
                double areaTriangulo = (base * altura) / 2;
                System.out.println("el area del triangulo es: " + areaTriangulo);
                break;
            case 2:
                double areacuadrado = base * altura ;
                System.out.println("el area del cuadrado es: " + areacuadrado);
                break;
            case 3:
                double arearectangulo = base * altura;

                System.out.println("el area del rectangulo es: " + arearectangulo);
                break;
            default:
                break;
        }
        scanner.close();
    }
}