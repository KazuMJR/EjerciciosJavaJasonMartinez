import java.util.Scanner;

//programa que solicite al usuario un número y luego imprima todos los
// números desde 1 hasta ese número.
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para imprimir del 1 hasta el numero ingresado:");
        int numero = scanner.nextInt();

        Numero num = new Numero(numero);
        int resultado = num.numeros(numero);
        System.out.println(resultado);
    }
}