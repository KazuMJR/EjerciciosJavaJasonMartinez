import java.util.Scanner;

//programa que solicite al usuario ingresar tres números y muestre el mayor de los tres.
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        Mayor numero = new Mayor();

        System.out.println("Ingrese tres numero para determinar cual es el mayor.");

        System.out.println("Ingrese el primer numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el Tercer numero:");
        int numero3 = scanner.nextInt();

        int resultado = numero.mayorde(numero1, numero2, numero3);
        System.out.println("El numero mayor es: " + resultado);
    }
}