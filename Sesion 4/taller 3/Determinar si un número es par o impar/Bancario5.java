import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Bancario5 {
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

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de la cuenta bancaria del cliente: ");
        int num = scanner.nextInt();

        if (esPar(num)) {
            System.out.println("El número de la cuenta bancaria: " + num + " es par.");
        } else {
            System.out.println("El número de la cuenta bancaria: " + num + " es impar.");
        }

        scanner.close();
    }
    
}
