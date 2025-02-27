import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Salud3 {
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

        class Usuario {
            String nombre;
            String diagnostico;

            Usuario(String nombre, String diagnostico) {
                this.nombre = nombre;
                this.diagnostico = diagnostico;
            }
        }

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan Ortiz", "Gripe"));
        usuarios.add(new Usuario("Maria Perez", "Covid-19"));
        usuarios.add(new Usuario("Carlos Lopez", "Fiebre"));
        usuarios.add(new Usuario("Ana Torres", "Gripe"));
        usuarios.add(new Usuario("Luis Garcia", "Covid-19"));
        usuarios.add(new Usuario("Laura Martinez", "Fiebre"));
        usuarios.add(new Usuario("Pedro Sanchez", "Gripe"));
        usuarios.add(new Usuario("Sofia Ramirez", "Covid-19"));
        usuarios.add(new Usuario("Javier Gomez", "Fiebre"));
        usuarios.add(new Usuario("Isabel Cruz", "Gripe"));
        usuarios.add(new Usuario("Diego Morales", "Covid-19"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el diagnóstico a buscar: ");
        String diagnosticoBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (Usuario usuario : usuarios) {
            if (usuario.diagnostico.equalsIgnoreCase(diagnosticoBuscado)) {
                System.out.println("Nombre: " + usuario.nombre + ", Diagnóstico: " + usuario.diagnostico);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún usuario con el diagnóstico: " + diagnosticoBuscado);
        }
        scanner.close();

    }
}
