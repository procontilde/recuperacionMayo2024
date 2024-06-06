package trimestre2;

public class ejercicio2_3LineaFactura {

        private ejercicio2_1Producto producto;
        private int cantidad;

        public ejercicio2_3LineaFactura(ejercicio2_1Producto producto, int cantidad) {

            this.producto = producto;
            if (cantidad <= 0) this.cantidad = 1;
                else this.cantidad = cantidad;

        }

        public ejercicio2_1Producto getProducto() { return producto; }
        public int getCantidad() { return cantidad; }
        public double getTotal() { return producto.getPrecio() * cantidad; }

        public void setProducto(ejercicio2_1Producto producto) { this.producto = producto; }
        public void setCantidad(int cantidad) {

            if (cantidad >= 1) this.cantidad = cantidad;

        }

}
