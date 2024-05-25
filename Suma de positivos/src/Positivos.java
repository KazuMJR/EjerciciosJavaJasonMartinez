public class Positivos {
    private int num1;
    private int num2;

    public Positivos() {

    }

    public Positivos(int num2, int num1) {
        this.num2 = num2;
        this.num1 = num1;
    }

    public int suma (int num1, int num2) {

            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        return num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
