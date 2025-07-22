import prueba.cafe;

public class Tiendacafe {
        public static void main(String[] args) {

        cafe cafe1 = new cafe("Arabica", "Etiopia", 4589.50, 5);
        cafe cafe2 = new cafe("Robusta", "Africa", 3569.49, 6);
        cafe cafe3 = new cafe("Mocha", "Yemen", 26300.38, 12);

        cafe1.mostrarInformacion();
        System.out.println("El Precio Total Del Cafe Arabica Es De:" + cafe1.calcularPrecioTotal());

        cafe2.mostrarInformacion();
        System.out.println("El Precio Total Del Cafe Robusta Es De:" + cafe2.calcularPrecioTotal());

        cafe3.mostrarInformacion();
        System.out.println("El Precio Total Del Cafe Mocha Es De:" + cafe3.calcularPrecioTotal());

        cafe2.actualizaCantidad(10.8);
        cafe2.mostrarInformacion();
        cafe2.descuentoPorKilo(20);
    }
}
