public class Tabla {
    private int num1;

    public Tabla() {

    }

    public Tabla(int num1) {
        this.num1 = num1;
    }


    public int multiplicar(int num1){

        System.out.println("Tabla del numero "+num1);
        for(int i=1;i<=10;i++){
            System.out.println(num1 + "*" + i + " = " + num1*i);
        }
        return num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
}
