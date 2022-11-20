public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = 16;
        sumaNumerosDeTresValores(a,b,c);

        //Segunda parte
        int puerta = 4;
        System.out.println("Coche tiene 4 puertas");
        Coche.numeroPuertas();
        System.out.println(puerta);

    }
    public static int sumaNumerosDeTresValores (int a, int b, int c){
        int suma;
        suma = a + b + c;
        System.out.println(suma);
        return suma;
    }
    //segunda parte Coche
    public class Coche {
        int resultado;

        public static int numeroPuertas (int resultado, int puerta){
            resultado = puerta + 1;
            return resultado;
        }
    }
}