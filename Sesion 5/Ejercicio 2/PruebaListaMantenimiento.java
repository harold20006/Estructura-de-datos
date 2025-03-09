import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class PruebaListaMantenimiento {
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

        ListaEnlazadaMantenimiento lista = new ListaEnlazadaMantenimiento();

        Scanner sc = new Scanner(System.in);
        int n=1;
        while (n!=0) {
            System.out.println("Desea agregar una solicitud de mantenimiento? 1=si, 0=no");
            n = sc.nextInt();
            if (n==1) {
                System.out.println("Ingrese el ID de la solicitud");
                String id = sc.next();                          //generar las solicitudes a partir de la entrada del usuario
                System.out.println("Ingrese el equipo a reparar");
                String equipo = sc.next();
                System.out.println("Ingrese la prioridad de la solicitud");
                String prioridad = sc.next();
                lista.agregarSolicitud(id, equipo, prioridad);
            }
        }

        sc.close();
 
        // Mostrar solicitudes pendientes
        System.out.println("Solicitudes pendientes:");
        lista.mostrarSolicitudes();
        
        // Procesar todas las solicitudes
        while (lista.size() > 0) {
            // Procesar la solicitud más prioritaria
            SolicitudMantenimiento procesada = lista.procesarSolicitud();
            System.out.println("\nSolicitud procesada: ID: " + procesada.getId() + ", Equipo: " + procesada.getEquipo());
 
            // Mostrar solicitudes pendientes después del procesamiento
            System.out.println("\nSolicitudes pendientes:");
            lista.mostrarSolicitudes();
        }
    }
}