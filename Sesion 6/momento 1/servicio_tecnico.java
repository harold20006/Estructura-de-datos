import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class servicio_tecnico {
    public static class cliente {
        String nombre;
        String prioridad;

        public cliente(String nombre, String prioridad) {
            this.nombre = nombre;
            this.prioridad = prioridad;
        }

        public String toString() {
            return "Cliente{" +
                    "nombre='" + nombre + '\'' +
                    ", prioridad='" + prioridad + '\'' +
                    '}';
        }

        public static cliente[] agregarcliente(cliente[] clientes, cliente nuevocliente) {
            cliente[] nuevosclientes = new cliente[clientes.length + 1];
            for (int i = 0; i < clientes.length; i++) {
                nuevosclientes[i] = clientes[i];
            }
            nuevosclientes[nuevosclientes.length - 1] = nuevocliente;
            return nuevosclientes;
        }
        public static void ordenarclientesPorPrioridad(cliente[] clientes) {
            int n = clientes.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (compararPrioridad(clientes[j].prioridad, clientes[j + 1].prioridad) > 0) {
                        // Intercambiar clientes[j] y clientes[j + 1]
                        cliente temp = clientes[j];
                        clientes[j] = clientes[j + 1];
                        clientes[j + 1] = temp;
                    }
                }
            }
        }

        public static int compararPrioridad(String p1, String p2) {
            String[] prioridades = { "críticas", "importantes", "generales" };
            int prioridad1 = -1, prioridad2 = -1;
            for (int i = 0; i < prioridades.length; i++) {
                if (prioridades[i].equals(p1)) {
                    prioridad1 = i;
                }
                if (prioridades[i].equals(p2)) {
                    prioridad2 = i;
                }
            }
            return Integer.compare(prioridad1, prioridad2);
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
            Scanner scanner = new Scanner(System.in);
            cliente[] clientes = {
                    new cliente("Ana", "críticas"),
                    new cliente("Pedro", "generales"),
                    new cliente("Maria", "importantes"),
                    new cliente("Carlos", "críticas"),
                    new cliente("Sofia", "importantes"),
                    new cliente("Miguel", "generales"),
                    new cliente("Laura", "críticas"),
                    new cliente("Javier", "importantes"),
                    new cliente("Elena", "generales"),
                    new cliente("Andres", "críticas"),
                    new cliente("Luis", "importantes"),
                    new cliente("Juan", "generales"),
            };

            ordenarclientesPorPrioridad(clientes);

            System.out.println("clientes ordenados:");
            for (cliente p : clientes) {
                System.out.println(p);
            }

            int opcion = 0;

            while (opcion != 2) {
                System.out.println("Ingrese una opcion:");
                System.out.println("1. Agregar un nuevo cliente");
                System.out.println("2. salir...");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre del cliente:");
                        String nombrecliente = scanner.nextLine();
                        System.out.println("Ingrese la prioridad del cliente (críticas, importantes, generales):");
                        String prioridadcliente = scanner.nextLine();
                        cliente nuevocliente = new cliente(nombrecliente, prioridadcliente);
                        clientes = agregarcliente(clientes, nuevocliente);
                        ordenarclientesPorPrioridad(clientes);
                        System.out.println("clientes ordenados por prioridad:");
                        for (cliente p : clientes) {
                            System.out.println(p);
                        }
                        break;
                    case 2:
                    System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }

            scanner.close();
        }
    }
}