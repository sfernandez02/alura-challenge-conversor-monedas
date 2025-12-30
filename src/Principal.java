import com.google.gson.Gson;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarApi consulta = new ConsultarApi();
        int opcion;
        do{
            System.out.println("********************\n" +
                    "conversor de monedas\n" +
                    "1) Dólar =>> Peso argentino\n" +
                    "2) Peso argentino =>> Dólar\n" +
                    "3) Dolar =>> Real brasileño\n" +
                    "4) Real brasileño =>> Dólar\n" +
                    "5) Dólar =>> Peso colombiano\n"+
                    "6) Peso Colombiano ==> Dólar\n"+
                    "7) salir\n" +
                    "Elija una opcion valida:\n" +
                    "***************************");
            opcion = lectura.nextInt();

            switch (opcion){
                case 1,2,3,4,5,6 -> {
                    System.out.println("Ingrese el monto a convertir:");
                    double monto = lectura.nextDouble();
                    switch (opcion) {
                        case 1 -> System.out.println(consulta.convertirMonedas("USD", "ARS", monto));
                        case 2 -> System.out.println(consulta.convertirMonedas("ARS", "USD", monto));
                        case 3 -> System.out.println(consulta.convertirMonedas("USD", "BRL", monto));
                        case 4 -> System.out.println(consulta.convertirMonedas("BRL", "USD", monto));
                        case 5 -> System.out.println(consulta.convertirMonedas("USD", "COP", monto));
                        case 6 -> System.out.println(consulta.convertirMonedas("COP", "USD", monto));
                    }
                }
                case 7-> System.out.println("saliendo del programa.....");
                default-> System.out.println("opcion no valida");
            }
        }while (opcion != 7);
    }
}
