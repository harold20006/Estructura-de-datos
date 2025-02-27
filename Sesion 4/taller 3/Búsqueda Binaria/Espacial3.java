import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class Espacial3 {
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

    public class foto {
        int id;
        String nombre;
        String codigo;

        foto(int id, String nombre, String codigo) {
            this.id = id;
            this.nombre = nombre;
            this.codigo = codigo;
        }
    }

    public static void main(String[] args) {
        ArrayList<foto> fotos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3500000; i++) {
            int id = i;
            String nombre = "Foto" + i;
            String codigo = "Codigo" + random.nextInt(1000000);
            fotos.add(new Espacial3().new foto(id, nombre, codigo));
        }

        System.out.println("Se han generado " + fotos.size() + " fotos.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID de la foto que desea buscar: ");
        int idBuscado = scanner.nextInt();

        foto fotoEncontrada = null;
        for (foto f : fotos) {
            if (f.id == idBuscado) {
                fotoEncontrada = f;
                break;
            }
        }

        if (fotoEncontrada != null) {
            System.out.println("Foto encontrada:");
            System.out.println("ID: " + fotoEncontrada.id);
            System.out.println("Nombre: " + fotoEncontrada.nombre);
            System.out.println("Codigo: " + fotoEncontrada.codigo);
        } else {
            System.out.println("Foto con ID " + idBuscado + " no encontrada.");
        }

        scanner.close();
    }

}
