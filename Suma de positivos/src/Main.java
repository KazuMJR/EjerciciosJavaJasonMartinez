import java.util.Scanner;

//programa que pida al usuario ingresar números positivos y los sume,
// deteniéndose cuando ingresa un número negativo.
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese solo numero positovos para sumar.");

        while(true) {
            System.out.print("Ingrese el primer numero: ");
            int primero = scanner.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            int segundo = scanner.nextInt();

            Positivos positivos = new Positivos(primero, segundo);

            int resultado = positivos.suma(primero, segundo);

            if(primero <0 || segundo < 0) {
                System.out.println("Se ingreso un valor negativo fin del programa");
                break;
            }

        }
    }
}