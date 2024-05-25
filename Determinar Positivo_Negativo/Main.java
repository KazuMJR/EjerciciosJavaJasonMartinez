import java.util.Scanner;

//programa que determine si un número ingresado por el usuario es positivo, negativo o cero.
public class Main {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        //Pedimos al usuario ingresar un numero
        System.out.println("Ingrese un numero: ");

        int num = numero.nextInt();

        if(num > 0){
            System.out.println("El numero: " + num + ", es positivo");
        }
        else if(num < 0){
            System.out.println("El numero: " + num + ", es negativo");
        }
        else{
            System.out.println("El numero es cero");
        }
    }

}
