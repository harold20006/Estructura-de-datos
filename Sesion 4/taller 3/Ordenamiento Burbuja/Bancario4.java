import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bancario4 {
    public static class cliente {

        String nombre;
        int ingresos;

        public cliente(String nombre, int ingresos) {
            this.nombre = nombre;
            this.ingresos = ingresos;
        }

        public String toString() {
            return nombre + " " + ingresos;
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

    public static void ordenarClientesPorIngresos(cliente[] clientes) {
        int n = clientes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (clientes[j].ingresos > clientes[j + 1].ingresos) {
                    cliente temp = clientes[j];
                    clientes[j] = clientes[j + 1];
                    clientes[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        encabezadopgm();
        cliente[] clientes = {
                new cliente("Juan", 1000000),
                new cliente("Pedro", 5000000),
                new cliente("Maria", 2000000),
                new cliente("Luis", 15000000),
                new cliente("Ana", 30000000)
        };
        ordenarClientesPorIngresos(clientes);

        System.out.println("\nClientes ordenados por ingresos:");
        for (cliente c : clientes) {
            System.out.println(c);
        }
    }

}
