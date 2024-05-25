import java.util.Scanner;

//programa que determine si un año ingresado por el usuario es bisiesto o no.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    int ano;
        System.out.println("Ingrese un año para conocer si es bisiesto.");
        ano = scanner.nextInt();

        Bisiesto numero = new Bisiesto();

        int resultado = numero.Determinar(ano);
        System.out.println(resultado);
    }

}