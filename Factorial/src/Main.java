import java.util.Scanner;

//programa que calcule el factorial de un número ingresado por el usuario.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero para conocer su factorial: ");
        int n = sc.nextInt();

        System.out.println("El factorial del numero ingresado es: ");

    Factorial f = new Factorial(n);

    System.out.println(f.factorial(n));
    }
}