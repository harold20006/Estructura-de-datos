import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PruebaListaMantenimiento {
    public static void main(String[] args) {
        String nombre = "Harold Roldan Vargas";
        String campus = "Campus Cali, U. Cooperativa de Colombia";
        String repositorioGit = "https://congenial-capybara-4jq59xwjgjg6cg5j.github.dev/";

        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHora = ahora.format(formateador);

        System.out.println();
        System.out.println("+----------------------------------------");
        System.out.println("| 👤 Nombre: " + nombre);
        System.out.println("| 🎓 Campus: " + campus);
        System.out.println("| 📅 Fecha y hora: " + fechaHora);
        System.out.println("| 📂 Repositorio Git: " + repositorioGit);
        System.out.println("+----------------------------------------");
        System.out.println();

        ListaEnlazadaMantenimiento lista = new ListaEnlazadaMantenimiento();

        lista.agregarSolicitud("M001", "Baño", "media");
        lista.agregarSolicitud("M002", "Generador Principal", "alta");
        lista.agregarSolicitud("M003", "aire acondicionado", "baja");
        lista.agregarSolicitud("M004", "Sensor de humo", "alta");
        lista.agregarSolicitud("M005", "Sistema de fuga", "media");

        System.out.println("Solicitudes pendientes:");
        lista.mostrarSolicitudes();

        while (lista.size() > 0) {

            SolicitudMantenimiento procesada = lista.procesarSolicitud();
            System.out
                    .println("\nSolicitud procesada: ID: " + procesada.getId() + ", Equipo: " + procesada.getEquipo());

            System.out.println("\nSolicitudes pendientes:");
            lista.mostrarSolicitudes();
        }
    }
}