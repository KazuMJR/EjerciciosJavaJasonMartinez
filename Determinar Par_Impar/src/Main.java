import java.util.Scanner;

//programa que verifique si un número ingresado por el usuario es par o impar.
public class Main {

    public static void main(String[] args) {

        Scanner Par_Impar = new Scanner(System.in);

        System.out.print("Ingrese un numero para determinar si es par o impar: ");

        int numero = Par_Impar.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        }
        else if (numero % 2 != 0) {
            System.out.println("El numero " + numero + " es impar");
        }
    }
}