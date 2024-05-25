public class Numero {
    private int num;


    public Numero() {

    }
    public Numero(int num) {
    this.num = num;
    }

    public int numeros (int num){
    int resultado = 0;
    int i = 1;
        while(i <= num){
            System.out.println(i);
            i ++;
        }
        return resultado;
    }


        public int getNum () {
            return num;
        }

        public void setNum ( int num){
            this.num = num;
        }

}
