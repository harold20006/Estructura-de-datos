import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Espacial4 {
    public static class EspectrosEstrellas {

        int numerodelespectro;
        int temperatura;

        public EspectrosEstrellas(int numerodelespectro, int temperatura) {
            this.numerodelespectro = numerodelespectro;
            this.temperatura = temperatura;
        }

        public String toString() {
            return "Espectro " + numerodelespectro + " -- " + "Temperatura " + temperatura;
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

    public static void ordenarEspectrosPorTemperatura(EspectrosEstrellas[] espectros) {
        int n = espectros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (espectros[j].temperatura > espectros[j + 1].temperatura) {
                    EspectrosEstrellas temp = espectros[j];
                    espectros[j] = espectros[j + 1];
                    espectros[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        encabezadopgm();
        EspectrosEstrellas[] espectros = {
                new EspectrosEstrellas(1, 100),
                new EspectrosEstrellas(2, 300),
                new EspectrosEstrellas(3, 200),
                new EspectrosEstrellas(4, 400),
                new EspectrosEstrellas(5, 500),
        };

        ordenarEspectrosPorTemperatura(espectros);

        System.out.println("\nEspectros ordenados por temperatura:");
        for (EspectrosEstrellas espectro : espectros) {
            System.out.println(espectro);
        }
    }

}
