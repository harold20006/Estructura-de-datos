import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio06 {
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

    public static int maximo(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        encabezadopgm();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("El número máximo es: " + maximo(arr));

        scanner.close();

    }

}