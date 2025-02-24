import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio03 {
    public static void encabezadopgm() {
        // Datos del encabezado
        String nombre = "Harold Roldan Vargas";
        String campus = "Campus Cali, U. Cooperativa de Colombia";
        String repositorioGit = "https://congenial-capybara-4jq59xwjgjg6cg5j.github.dev/";

        // Obtener la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHora = ahora.format(formateador);

        // imprimir encabezado
        System.out.println();
        System.out.println("+----------------------------------------");
        System.out.println("| 👤 Nombre: " + nombre);
        System.out.println("| 🎓 Campus: " + campus);
        System.out.println("| 📅 Fecha y hora: " + fechaHora);
        System.out.println("| 📂 Repositorio Git: " + repositorioGit);
        System.out.println("+----------------------------------------");
        System.out.println();
    }

    public static int busquedaBinaria(int[] arr, int target) {
        int izquierda = 0, derecha = arr.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (arr[medio] == target)
                return medio;
            if (arr[medio] < target)
                izquierda = medio + 1;
            else
                derecha = medio - 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        encabezadopgm();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Ingrese los elementos del array en orden ascendente:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int target = scanner.nextInt();

        int resultado = busquedaBinaria(arr, target);
        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }

        scanner.close();
    }
}
