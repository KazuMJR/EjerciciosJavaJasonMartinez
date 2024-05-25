public class paresPositivos {
    private int num;


    public paresPositivos() {

    }


    public paresPositivos(int num) {
        this.num = num;
    }

    public int pares(int num){
        int suma = 0;
        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                suma += i;
                System.out.println("Suma de los numero pares hasta " + i + " es: " + suma);
            }
        }
        return suma;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
