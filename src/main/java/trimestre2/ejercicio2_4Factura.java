package trimestre2;

import java.util.ArrayList;
import java.util.List;

public class ejercicio2_4Factura {

    private int codigoFactura;
    private String fecha;
    private List<ejercicio2_3LineaFactura> lineasFactura;

    public ejercicio2_4Factura(int codigoFactura, String fecha) {

        this.codigoFactura = codigoFactura;
        this.fecha = fecha;
        this.lineasFactura = new ArrayList<>();

    }


    public void agregarLineaFactura(ejercicio2_3LineaFactura lineaFactura) {

        if (!lineasFactura.contains(lineaFactura)) lineasFactura.add(lineaFactura);

    }

    public void eliminarLineaFactura(ejercicio2_3LineaFactura lineaFactura) {

        lineasFactura.remove(lineaFactura);

    }

    public ejercicio2_3LineaFactura buscarLineaFactura(int codigoProducto) {

        for (ejercicio2_3LineaFactura linea : lineasFactura) if (linea.getProducto().getCodigo() == codigoProducto) return linea;

        return null;

    }
    public int getCodigoFactura() { return codigoFactura; }
    public String getFecha() { return fecha; }
    public List<ejercicio2_3LineaFactura> getLineasFactura() { return lineasFactura; }
    public ejercicio2_3LineaFactura[] getDatosFactura() {

        return lineasFactura.toArray(new ejercicio2_3LineaFactura[0]);

    }
    public double getTotalFactura() {

        double totalFactura = 0;

        for (ejercicio2_3LineaFactura linea : lineasFactura) {

            totalFactura += linea.getTotal();

        }

        return totalFactura;

    }


}
