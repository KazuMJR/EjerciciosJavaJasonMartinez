import java.util.Scanner;

//programa que solicite al usuario un número y muestre la tabla de
// multiplicar de ese número del 1 al 10.
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero para mostrar su tabla de multiplicar: ");
        int num = sc.nextInt();


        Tabla tabla = new Tabla(num);

        int resultado = tabla.multiplicar(num);
    }
}