import java.util.Scanner;

//programa que genere la secuencia de Fibonacci hasta un número ingresado por el usuario.
public class Main {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Ingrese un numero de donde parara la secuencia fibonacci: ");
     int n = sc.nextInt();

     Fibonacci limite = new Fibonacci(n);

     int resultado = limite.secuenciaFibonacci(n);

 }

}