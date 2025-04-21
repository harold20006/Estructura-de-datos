import java.util.LinkedList;

public class ListaEnlazadaMantenimiento {
    private LinkedList<SolicitudMantenimiento> lista;

    public ListaEnlazadaMantenimiento() {
        lista = new LinkedList<>();
    }

    public void agregarSolicitud(String id, String zona, String prioridad) {
        lista.add(new SolicitudMantenimiento(id, zona, prioridad));
    }

    public SolicitudMantenimiento procesarSolicitud() {

        return lista.poll();
    }

    public void mostrarSolicitudes() {
        for (SolicitudMantenimiento solicitud : lista) {
            System.out.println("ID: " + solicitud.getId() + ", Equipo: " + solicitud.getEquipo() + ", Prioridad: "
                    + solicitud.getPrioridad());
        }
    }

    public int size() {
        return lista.size();
    }
}