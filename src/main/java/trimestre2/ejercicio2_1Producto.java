package trimestre2;

public class ejercicio2_1Producto {

    private int codigo;
    private String descripcion;
    private double precio;

    public ejercicio2_1Producto(int codigo, String descripcion, double precio) {

        if (codigo < 0) this.codigo = 0;
            else this.codigo = codigo;
        this.descripcion = descripcion;
        if (precio < 0) this.precio = 0;
            else this.precio = precio;

    }

    public int getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }

    public void setCodigo(int codigo) {

        if (codigo < 0) this.codigo = 0;
           else this.codigo = codigo;

    }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setPrecio(double precio) {

        if (precio >= 0) this.precio = precio;

    }

}


