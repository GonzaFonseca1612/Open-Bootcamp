public class Main {
    public static void main(String[] args) {
        System.out.println("***Condicionales***");
        int numeroIf = 6;
        if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        }
        else {
            System.out.println("Es cero");
        }

        System.out.println("***Bucle While***");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("***Bucle Do-While***");
        int contador = 0;
        do {
            contador++;
            System.out.println(contador);
        } while (contador < 1);

        System.out.println("***Bucle for***");
        for (int numeroFor = 0; numeroFor <= 3;numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("***Switch***");
        String estacion = "Verano";

        switch (estacion) {
            case "Verano":
                System.out.println("Verano");
                break;
            case "Invierno":
                System.out.println("Invierno");
                break;
            case "Otonio":
                System.out.println("Otonio");
                break;
            case "Primavera":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}