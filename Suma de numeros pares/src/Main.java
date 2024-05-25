import java.util.Scanner;

//programa en Java que solicite al usuario ingresar un número
// entero positivo n y luego calcule la suma de todos los números pares desde 1 hasta n.
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero para calcular la suma de todos los numero positivos antes que el descrito: ");
        int num1 = sc.nextInt();

        paresPositivos p = new paresPositivos(num1);

        int resultado = p.pares(num1);
    }
}