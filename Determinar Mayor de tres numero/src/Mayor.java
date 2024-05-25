public class Mayor {
    private int numero1;
    private int numero2;
    private int numero3;

    public Mayor() {

    }

    public Mayor(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int mayorde (int numero1, int numero2, int numero3){
       int resultado = 0;
      if(numero1 > numero2 && numero1 > numero3){
          resultado = numero1;
      }
      else if(numero2 > numero1 && numero2 > numero3){
          resultado = numero2;
      }
      else if(numero3 > numero1 && numero3 > numero2){
          resultado = numero3;
      }
        return resultado;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
}
