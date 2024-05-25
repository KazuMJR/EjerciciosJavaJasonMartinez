public class Orden {
    private int numero;

public Orden (){

}
    public Orden(int numero) {
        this.numero = numero;
    }

    public int numeros(int numero){
        int resultado = 0;

        while (numero <= 20){
            System.out.println(numero);
            numero ++;
        }

        return resultado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
