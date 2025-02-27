import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Telecounicaciones3 {
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
    
    static class Usuario{

        int id;
        String nombre;
        int telefono;

        Usuario(int id, String nombre, int telefono){
            this.id = id;
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }
    
    public static void main(String[] args) {
        encabezadopgm();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "Juan Ortiz", 123456789));
        usuarios.add(new Usuario(2, "Maria Perez", 987654321));
        usuarios.add(new Usuario(3, "Carlos Lopez", 456789123));
        usuarios.add(new Usuario(4, "Ana Torres", 321654987));
        usuarios.add(new Usuario(5, "Luis Garcia", 789123456));
        usuarios.add(new Usuario(6, "Laura Martinez", 654789321));
        usuarios.add(new Usuario(7, "Pedro Sanchez", 159753486));
        usuarios.add(new Usuario(8, "Sofia Ramirez", 753159486));
        usuarios.add(new Usuario(9, "Javier Gomez", 951753486));
        usuarios.add(new Usuario(10, "Isabel Cruz", 852963741));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del usuario a buscar: ");
        int idBuscado = scanner.nextInt();
        boolean encontrado = false;
        for (Usuario usuario : usuarios) {
            if (usuario.id == idBuscado) {
                System.out.println("Usuario encontrado: " + usuario.nombre + ", Teléfono: " + usuario.telefono);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Usuario no encontrado.");
        }
        scanner.close();
    }
}
