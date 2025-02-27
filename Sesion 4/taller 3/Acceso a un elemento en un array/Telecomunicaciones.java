import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Telecomunicaciones {

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

    public static int obtenerPrimerElemento(int[] arr) {
        return arr[0];
    }

    public static void main(String[] args) {
        encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de routers activos:");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];

        System.out.println("Ingrese el codigo de los routers activos:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("El primer nodo de la lista de routers activos es: " + obtenerPrimerElemento(arr));

        scanner.close();
    }

}
