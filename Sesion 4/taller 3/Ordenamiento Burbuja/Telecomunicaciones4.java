import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Telecomunicaciones4 {

    public static class torre {
        String codigo;
        int intensidad;

        public torre(String codigo, int intensidad) {
            this.codigo = codigo;
            this.intensidad = intensidad;
        }

        public String toString() {
            return "Torre "+codigo + "--" +"Intensidad " + intensidad;
        }

    }

    public static void ordenarTorresPorIntensidad(torre[] torres) {
        int n = torres.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (torres[j].intensidad > torres[j + 1].intensidad) {
                    torre temp = torres[j];
                    torres[j] = torres[j + 1];
                    torres[j + 1] = temp;
                }
            }
        }
    }

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
        torre[] torres = {
                new torre("T1", 1100),
                new torre("T2", 300),
                new torre("T3", 200),
                new torre("T4", 4500),
                new torre("T5", 5050),
        };

        ordenarTorresPorIntensidad(torres);

        System.out.println("Torres ordenadas por intensidad:");
        for (torre t : torres) {
            System.out.println(t);
        }
    }

}
