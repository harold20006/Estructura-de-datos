import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agropecuario4 {

    public static class ParcelaCultivo {
        String nombre;
        LocalDateTime fechaSiembra;

        public ParcelaCultivo(String nombre, LocalDateTime fechaSiembra) {
            this.nombre = nombre;
            this.fechaSiembra = fechaSiembra;
        }

        public String toString() {
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            return "Parcela " + nombre + " -- " + "Fecha de siembra " + fechaSiembra.format(formateador);
        }

    }

    public static void ordenarParcelasPorFechaSiembra(ParcelaCultivo[] parcelas) {
        int n = parcelas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (parcelas[j].fechaSiembra.isAfter(parcelas[j + 1].fechaSiembra)) {
                    ParcelaCultivo temp = parcelas[j];
                    parcelas[j] = parcelas[j + 1];
                    parcelas[j + 1] = temp;
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
        ParcelaCultivo[] parcelas = {
                new ParcelaCultivo("Parcela 1", LocalDateTime.of(2021, 10, 15, 2, 5, 10)),
                new ParcelaCultivo("Parcela 2", LocalDateTime.of(2021, 9, 24, 5, 10, 15)),
                new ParcelaCultivo("Parcela 3", LocalDateTime.of(2021, 11, 12, 10, 15, 20)),
                new ParcelaCultivo("Parcela 4", LocalDateTime.of(2021, 8, 5, 15, 20, 25)),

        };

        ordenarParcelasPorFechaSiembra(parcelas);

        System.out.println("Parcelas ordenadas por fecha de siembra:");
        for (ParcelaCultivo parcela : parcelas) {
            System.out.println(parcela);
        }
    }
}
