package trimestre1;

import java.util.Scanner;

public class ejercicio1_3SumaDeParejas {

        public static void main(String[] args) {

            Scanner miScan = new Scanner(System.in);

            int n;

            do {

                System.out.println("Introduzca un número par positivo mayor que 0:");

                while (!miScan.hasNextInt()) {

                    System.out.println("Introduzca un número válido:");
                    miScan.next();

                }

                n = Integer.valueOf(miScan.nextLine());

            } while (n <= 0 || n % 2 != 0);

            int[] array = new int[n];

            for (int i = 0; i < n; i++) {

                System.out.println("Introduzca el número " + (i + 1) + ":");
                array[i] = miScan.nextInt();

            }

            System.out.println("Suma de las parejas:");

            for (int i = 0; i < n / 2; i++) {

                System.out.println(array[i] + " + " + array[i + n / 2]);

            }

            miScan.close();

        }

    }


