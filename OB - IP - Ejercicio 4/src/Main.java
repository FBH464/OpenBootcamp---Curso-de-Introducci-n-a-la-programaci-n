public class Main {
    public static void main(String[] args) {

        //Uso de If
        int numeroIf =0;

        if (numeroIf < 0) {
            System.out.println("Es un número negativo");
        }
        else if (numeroIf > 0) {
            System.out.println("Es un número positivo");
        }
        else if (numeroIf == 0) {
            System.out.println("Es un número con valor 0");
        }

        //Bucle While
        int numeroWhile = 0;

        while (numeroWhile <= 3) {
            numeroWhile ++;
            System.out.println("Valor numeroWhile: " + numeroWhile);
            System.out.println("La variable numeroWhile se a incrementado");
        }

        //Bucle Do While

        int doWhile = 0;
        do{
            System.out.println("Valor inicio doWhile: " + doWhile);
            doWhile ++;
        }
        while (numeroWhile <= 3);
        System.out.println("La variable doWhile se a incrementado a 3");
        System.out.println("Valor final doWhile: " + doWhile);

        //Bucle For

        for (int numeroFor = 0; numeroFor <=3; numeroFor++) {
            System.out.println("Valor incrementado: "+ numeroFor);
        }

        //Switch
        var estacion = "otoño";

        switch (estacion) {
            case "primavera":
                System.out.println("La estación es primavera");
                break;
            case "verano":
                System.out.println("La estación es verano");
                break;
            case "otoño":
                System.out.println("La estación es otoño");
                break;
            case "invierno":
                System.out.println("La estación es invierno");
                break;
            default:
                System.out.println("Esto no es una estación");

        }

    }


}