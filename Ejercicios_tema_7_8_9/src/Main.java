import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        String cadenaInvertida = reverse("Hola Mundo");
        System.out.println(cadenaInvertida);

        String[] cadena = {"Pedro", "Anthony", "Jason", "Christian", "Piero"};

        for (String s : cadena) {
            System.out.println(s);
        }

        //Ejercicio 2
        int[][] enteros = {
                {1, 2, 3, 4,},
                {10, 20, 30, 40},
                {100, 200, 300, 400},
                {50, 70, 90, 110}
        };

        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] " + "Valor: " + enteros[i][j]);
            }
        }

        //Ejercicio 3
        Vector<String> vector = new Vector<>();
        vector.add("Automovil");
        vector.add("Moto");
        vector.add("Camioneta");
        vector.add("Autobus");
        vector.add("Bicicleta");

        vector.remove(1);
        vector.remove(2);

        System.out.println(vector);

        //Ejercicio 4
        /*El problema de usar un Vector con la capacidad por defecto al tener 1000 elementos para añadirle, es que
        el Vector tendría que crear un array con el doble de capacidad cada vez que no tenga el espacio suficiente para agregar
        nuevos elementos, lo cuál no es recomendable, ya que consumiría recursos computacionales innecesarios.*/

        //Ejercicio 5
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mouse");
        arrayList.add("Teclado");
        arrayList.add("Monitor");
        arrayList.add("Case");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        for (String s : arrayList) {
            System.out.println(s);
        }

        for (String s : linkedList) {
            System.out.println(s);
        }

        //Ejercicio 6
        ArrayList<Integer> arrayEnteros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayEnteros.add(i);
            System.out.println(arrayEnteros.get(i - 1));
        }

        for (Iterator<Integer> it = arrayEnteros.iterator(); it.hasNext(); ) {
            Integer i = it.next();
            boolean isPar = i % 2 == 0;
            if (isPar) {
                it.remove();
                continue;
            }
            System.out.println(i);
        }

        //Ejercicio 7
        try {
            dividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        //Ejercicio 8
        copiarStream("archivo/text.txt", "archivo/resultado.txt");

        //Ejercicio 9
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese ruta del Archivo: ");
        String rutaArchivo = scanner.nextLine();
        InputStream in = null;
        try {
            in = new FileInputStream(rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Uno");
        nombres.add("Dos");
        nombres.add("Tres");
        nombres.add("Cuatro");
        nombres.add("Cinco");

        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            String dato = nombres.get(i - 1);
            hashMap.put(i, dato);
        }

        System.out.println("Ingrese ruta del Resultado: ");
        String salidaArchivo = scanner.next();

        try {
            PrintStream out = new PrintStream(salidaArchivo);
            byte[] bytesIn = in.readAllBytes();
            out.write(bytesIn);

            for (Map.Entry m : hashMap.entrySet()) {
                out.println("Key: " + m.getKey() + " " + "Value: " + m.getValue());
                System.out.println(hashMap);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void copiarStream(String fielin, String fielout) {
        try {
            InputStream inputStream = new FileInputStream(fielin);
            byte[] entrada = inputStream.readAllBytes();
            inputStream.close();

            PrintStream printStream = new PrintStream(fielout);
            printStream.write(entrada);
            printStream.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double dividePorCero() throws ArithmeticException {
        double resultado = 5 / 0;
        return resultado;
    }

    public static String reverse(String texto) {
        StringBuilder invertido = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido.append(texto.charAt(i));
        }
        return invertido.toString();
    }
}