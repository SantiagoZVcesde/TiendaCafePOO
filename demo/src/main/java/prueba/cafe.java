package prueba;
public class cafe {
    String nombre;
    String region;
    double precioPorKilo;
    double cantidadEnKilos;

    public cafe(String nombre, String region, double precioPorKilo, int cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    public void mostrarInformacion() {
        System.out.println("El Nombre Del Cafe Es:" + nombre);
        System.out.println("La Region Del Cafe Es:" + region);
        System.out.println("El Precio Del Cafe Es:" + precioPorKilo);
        System.out.println("La Cantidad EN Kilos Es De:" + cantidadEnKilos);
    }

    public double calcularPrecioTotal() {
        return this.precioPorKilo * (double) this.cantidadEnKilos;
    }

    public void actualizaCantidad(double nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
        System.out.println("\nCantidad actualizada a: " + cantidadEnKilos + " kg");
        System.out.println("Nuevo precio total: $" + calcularPrecioTotal() + " COP");
    }

    public void descuentoPorKilo(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = precioPorKilo * (porcentaje / 100);
            precioPorKilo -= descuento;
            System.out.println("Se aplicó un " + porcentaje + "% de descuento");
            System.out.println("Nuevo precio por kilo: $" + precioPorKilo );
        } else {
            System.out.println("Error: El porcentaje de descuento debe estar entre 0 y 100");
        }
    }
}
