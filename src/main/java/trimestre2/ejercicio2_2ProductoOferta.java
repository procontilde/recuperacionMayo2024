package trimestre2;

public class ejercicio2_2ProductoOferta extends ejercicio2_1Producto {

    private byte porcentajeDescuento;

    public ejercicio2_2ProductoOferta(int codigo, String descripcion, double precio, byte porcentajeDescuento) {

        super(codigo, descripcion, precio);
        setPorcentajeDescuento(porcentajeDescuento);

    }

    public byte getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(byte porcentajeDescuento) {

        if (porcentajeDescuento >= 1 && porcentajeDescuento <= 50) this.porcentajeDescuento = porcentajeDescuento;

    }

    @Override
    public double getPrecio() {

        double precioOriginal = super.getPrecio();
        double descuento = precioOriginal * (porcentajeDescuento / 100.0);
        return precioOriginal - descuento;

    }

}
