public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Jason", "Christian", "Anthony"};
        String cadena = "";
        for (String nombre : nombres) {
            cadena += nombre + " ";
        }
        System.out.println(cadena);
    }
}