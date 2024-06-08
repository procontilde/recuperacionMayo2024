package trimestre1;

import java.util.Scanner;

public class ejercicio1_1ManejoDeStrings {

    public static void main(String[] args) {

        Scanner miScan = new Scanner(System.in);

        System.out.println("Introduzca un texto:");
        String txt = miScan.nextLine();

        int letras = 0, vocales = 0, espacios = 0;

        for (int i = 0; i < txt.length(); i++) {

            char caracter = txt.charAt(i);

            if (Character.isLetter(caracter)) {

                letras++;

                if (esVocal(caracter)) {

                    vocales++;

                }

            } else if (Character.isWhitespace(caracter)) {

                espacios++;

            }

        }

        System.out.println("Letras: " + letras);
        System.out.println("Vocales: " + vocales);
        System.out.println("Espacios: " + espacios);

        miScan.close();

    }

    private static boolean esVocal(char c) {

        c = Character.toLowerCase(c);

        switch (c) {

            case 'a':

                return true;

            case 'e':

                return true;

            case 'i':

                return true;

            case 'o':

                return true;

            case 'u':

                return true;

            default:

                return false;

        }

    }

}
