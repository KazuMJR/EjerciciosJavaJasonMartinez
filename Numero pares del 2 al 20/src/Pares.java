public class Pares {
    private int n1 = 2, n2 = 20;

    public Pares() {
        this.n1 = 2;
        this.n2 = 20;
    }



    public int pares (int n1, int n2) {
        int resultado = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return resultado;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
