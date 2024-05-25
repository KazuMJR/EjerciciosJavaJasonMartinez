public class Fibonacci {
    private int num1 = 0;



    public Fibonacci(int num1) {
        this.num1 = num1;
    }

    public Fibonacci() {

    }

    public int secuenciaFibonacci(int num1) {
        int n = 0, n2 = 1, n3 = 1;
        while ( n <= num1) {
            System.out.println(n3);
           n3 = n + n2;
           n = n2;
           n2 = n3;
        }
        return n;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

}
