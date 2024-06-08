package trimestre2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio2_5MainProductoFactura {

        private static Map<Integer, ejercicio2_4Factura> mapaFacturas = new HashMap<>();
        private static int codigoFacturaActual = 1;
        private static Scanner miScan = new Scanner(System.in);

        public static void main(String[] args) {

            boolean salir = false;

            while (!salir) {

                System.out.println("Elija una de las siguientes opciones:\n\nA. Crear Factura\nB. Mostrar Facturas\nC. Añadir Producto a Factura\nD. Eliminar Producto de Factura\nE. Mostrar Total de una Factura\nF. Salir");

                String option = miScan.nextLine().toUpperCase();

                switch (option) {

                    case "A":

                        crearFactura();
                        break;

                    case "B":

                        mostrarFacturas();
                        break;

                    case "C":

                        agregarProductoFactura();
                        break;

                    case "D":

                        eliminarProductoFactura();
                        break;

                    case "E":

                        mostrarTotalFactura();
                        break;

                    case "F":

                        salir = true;
                        break;

                    default:

                        System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                        break;

                }

            }

            miScan.close();

        }

        private static void crearFactura() {

            System.out.print("Introduzca el código de la factura: ");
            int codigoFactura = Integer.valueOf(miScan.nextLine());
            System.out.print("Introduzca la fecha de la factura: ");
            String fecha = miScan.nextLine();

            ejercicio2_4Factura factura = new ejercicio2_4Factura(codigoFactura, fecha);
            mapaFacturas.put(codigoFactura, factura);
            System.out.println("Factura creada.");

        }

        private static void mostrarFacturas() {

            System.out.println("Facturas:");

            for (ejercicio2_4Factura factura : mapaFacturas.values()) {

                System.out.println("Código: " + factura.getCodigoFactura() + ", Fecha: " + factura.getFecha());

            }

        }

        private static void agregarProductoFactura() {

            System.out.print("Introduzca el código de la factura: ");
            int codigoFactura = Integer.valueOf(miScan.nextLine());

            ejercicio2_4Factura factura = mapaFacturas.get(codigoFactura);

            if (factura == null) {

                System.out.println("No se encontró la factura.");
                return;

            }

            System.out.print("Introduzca el código del producto: ");
            int codigoProducto = Integer.valueOf(miScan.nextLine());
            System.out.print("Introduzca la descripción del producto: ");
            String descripcion = miScan.nextLine();
            System.out.print("Introduzca el precio del producto: ");
            double precio = Double.valueOf(miScan.nextLine());
            System.out.print("Introduzca la cantidad: ");
            int cantidad = Integer.valueOf(miScan.nextLine());

            ejercicio2_1Producto producto = new ejercicio2_1Producto(codigoProducto, descripcion, precio);
            ejercicio2_3LineaFactura lineaFactura = new ejercicio2_3LineaFactura(producto, cantidad);

            factura.agregarLineaFactura(lineaFactura);
            System.out.println("Producto añadido a la factura.");

        }

        private static void eliminarProductoFactura() {

            System.out.print("Introduzca el código de la factura: ");
            int codigoFactura = Integer.valueOf(miScan.nextLine());

            ejercicio2_4Factura factura = mapaFacturas.get(codigoFactura);

            if (factura == null) {

                System.out.println("No se encontró la factura.");
                return;

            }

            System.out.print("Introduzca el código del producto a eliminar: ");
            int codigoProducto = Integer.valueOf(miScan.nextLine());

            ejercicio2_3LineaFactura lineaFactura = factura.buscarLineaFactura(codigoProducto);

            if (lineaFactura == null) {

                System.out.println("No se encontró el producto en la factura.");
                return;

            }

            factura.eliminarLineaFactura(lineaFactura);
            System.out.println("Producto eliminado de la factura.");

        }

        private static void mostrarTotalFactura() {

            System.out.print("Introduzca el código de la factura: ");
            int codigoFactura = Integer.valueOf(miScan.nextLine());

            ejercicio2_4Factura factura = mapaFacturas.get(codigoFactura);

            if (factura == null) {

                System.out.println("No se encontró la factura.");
                return;

            }

            System.out.println("Total de la factura: " + factura.getTotalFactura());

        }

}
