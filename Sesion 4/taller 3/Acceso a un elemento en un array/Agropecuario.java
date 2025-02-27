import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agropecuario {

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

    public static Double obtenerPrimerElemento(Double[] arr) {
        return arr[0];
    }

    public double obtenerHumedad() {
        Random rand = new Random();
        double humedad = rand.nextDouble(100);
        return humedad;
    }

    public static void main(String[] args) {
        encabezadopgm();
        Double[] arr = new Double[24];
        Agropecuario humedad = new Agropecuario();

        for (int i = 0; i < 24; i++) { 
            arr[i] = humedad.obtenerHumedad();
        }
        System.out.println("la primera lectura de humedad del dia es: " + obtenerPrimerElemento(arr) + "%");
    }
}
