//un programa que imprima los números pares del 2 al 20.
public class Main {


    public static void main(String[] args) {

        System.out.println("Numero pares del 2 al 20");

        Pares pares = new Pares();

        System.out.println(pares.pares(pares.getN1(), pares.getN2()));
    }
}