import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;

public class Agropecuario5 {
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

    public static void main(String[] args) {
        encabezadopgm();

        int n = 0;
        System.out.println("Ingrese la cantidad de lotes de pollo : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ArrayList<Integer> pollosp = new ArrayList<>();
        ArrayList<Integer> pollosi = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el la cantidad de pollos del lote " + (i + 1) + " :");
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                pollosp.add(a);
            } else {
                pollosi.add(a);
            }
        }

        scanner.close();
        System.out.println("Los lotes de pollos pares son: " + pollosp);
        System.out.println("Los lotes de pollos impares son: " + pollosi);
    }
}
