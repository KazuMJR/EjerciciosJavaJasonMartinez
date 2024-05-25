public class Bisiesto {
    private int año;

    public Bisiesto(){

    }

    public Bisiesto(int año) {
        this.año = año;
    }

    public int Determinar(int año){
        int resultado = 0;
        if((año % 4 == 0 && año % 100 != 0) || año % 400 == 0){
            System.out.println("Es un año bisiesto");
            resultado = año;
        }else{
            System.out.println("El año: " + año + " no es bisiesto.");
            resultado = año;
        }

       return resultado;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
