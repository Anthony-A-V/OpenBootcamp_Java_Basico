public class Main {
    public static void main(String[] args) {
        double resultado = calcularPrecio(500);
        System.out.println(resultado);
    }

    public static double calcularPrecio(double precio) {
        double iva, precioConIva;
        iva = 0.21;
        precioConIva = precio + (precio * iva);
        return precioConIva;
    }
}
