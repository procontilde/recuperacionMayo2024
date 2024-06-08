package trimestre1;

import java.util.Scanner;

public class ejercicio1_4ValorASCII {

    public static void main(String[] args) {

        Scanner miScan = new Scanner(System.in);

        String[] palabras = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Introduzca la palabra " + (i + 1) + ":");
            palabras[i] = miScan.nextLine();

            while (palabras[i].isEmpty()) {

                System.out.println("Debe introducir una palabra válida:");
                palabras[i] = miScan.nextLine();

            }

        }

        for (String palabra : palabras) {

            int valorAscii = calcularValorAscii(palabra);
            System.out.println(palabra + ": " + valorAscii);

        }

        miScan.close();

    }

    private static int calcularValorAscii(String palabra) {

        int valorAscii = 0;

        for (int i = 0; i < palabra.length(); i++) {

            valorAscii += (int) palabra.charAt(i);

        }

        return valorAscii;

    }

}


