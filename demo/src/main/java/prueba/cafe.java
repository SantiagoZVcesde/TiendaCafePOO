package prueba;

import java.util.Scanner;

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
}
