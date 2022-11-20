public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = 16;
        sumaNumerosDeTresValores(a,b,c);
    }
    public static int sumaNumerosDeTresValores (int a, int b, int c){
        int suma;
        suma = a + b + c;
        System.out.println(suma);
        return suma;
    }
}