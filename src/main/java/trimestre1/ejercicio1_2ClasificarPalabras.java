package trimestre1;

import java.util.Scanner;

public class ejercicio1_2ClasificarPalabras {

    private static Scanner miScan = new Scanner(System.in);

    public static void main(String[] args) {

        String palabra;

        do {

            System.out.println("Introduzca una palabra. Escriba 'stop' para terminar):");
            palabra = miScan.nextLine();

            if (!palabra.equalsIgnoreCase("stop")) clasificarPalabra(palabra);

        } while (!palabra.equalsIgnoreCase("stop"));

        miScan.close();

    }


    private static void clasificarPalabra(String palabra) {

        if (palabra.length() == 2) {

            System.out.println("Es una sílaba");

        } else if (palabra.toLowerCase().contains("ñ")) {

            System.out.println("Seguramente es del español");

        } else {

            System.out.println("¿Cuántas sílabas cree que tiene esta palabra?");
            miScan = new Scanner(System.in);
            int sugerencia = Integer.valueOf(miScan.nextLine());
            miScan.nextLine();

            if (palabra.length() % 2 == 0 || palabra.length() % 3 == 0) {

                if (sugerencia == palabra.length() / 2 || sugerencia == palabra.length() / 3) {

                    System.out.println("Estoy de acuerdo");

                } else {

                    System.out.println("No estoy de acuerdo");

                }

            } else {

                System.out.println("No estoy de acuerdo");

            }

        }

    }

}


