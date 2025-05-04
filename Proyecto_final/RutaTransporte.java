import java.util.*;

public class RutaTransporte {

    static class Conexion {
        int destino;
        int tiempo;

        Conexion(int destino, int tiempo) {
            this.destino = destino;
            this.tiempo = tiempo;
        }
    }

    public static void dijkstra(List<List<Conexion>> mapa, int origen) {
        int n = mapa.size();
        int[] distancias = new int[n];
        int[] anteriores = new int[n]; // Para reconstruir caminos
        Arrays.fill(distancias, Integer.MAX_VALUE);
        Arrays.fill(anteriores, -1);
        distancias[origen] = 0;

        PriorityQueue<int[]> cola = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        cola.offer(new int[]{origen, 0});

        while (!cola.isEmpty()) {
            int[] actual = cola.poll();
            int estacion = actual[0];
            int tiempo = actual[1];

            if (tiempo > distancias[estacion]) continue;

            for (Conexion conexion : mapa.get(estacion)) {
                int vecino = conexion.destino;
                int nuevoTiempo = tiempo + conexion.tiempo;

                if (nuevoTiempo < distancias[vecino]) {
                    distancias[vecino] = nuevoTiempo;
                    anteriores[vecino] = estacion; // Guardar de dónde venimos
                    cola.offer(new int[]{vecino, nuevoTiempo});
                }
            }
        }

        System.out.println("Rutas más rápidas desde la estación " + origen + ":\n");
        for (int i = 0; i < n; i++) {
            if (distancias[i] == Integer.MAX_VALUE) {
                System.out.println("Estación " + i + ": no alcanzable.");
            } else {
                System.out.print("Estación " + i + ": " + distancias[i] + " min - Ruta: ");
                imprimirRuta(i, anteriores);
                System.out.println();
            }
        }
    }

    public static void imprimirRuta(int destino, int[] anteriores) {
        List<Integer> ruta = new ArrayList<>();
        for (int actual = destino; actual != -1; actual = anteriores[actual]) {
            ruta.add(actual);
        }
        Collections.reverse(ruta);
        for (int i = 0; i < ruta.size(); i++) {
            System.out.print(ruta.get(i));
            if (i < ruta.size() - 1) System.out.print(" -> ");
        }
    }

    public static void main(String[] args) {
        int estaciones = 6;
        List<List<Conexion>> mapa = new ArrayList<>();

        for (int i = 0; i < estaciones; i++) {
            mapa.add(new ArrayList<>());
        }

        // Conexiones: mapa.get(origen).add(new Conexion(destino, tiempo));
        mapa.get(0).add(new Conexion(1, 5));
        mapa.get(0).add(new Conexion(2, 10));
        mapa.get(1).add(new Conexion(2, 3));
        mapa.get(1).add(new Conexion(3, 7));
        mapa.get(2).add(new Conexion(3, 2));
        mapa.get(3).add(new Conexion(4, 4));
        mapa.get(4).add(new Conexion(5, 6));
        mapa.get(2).add(new Conexion(5, 15));

        int estacionOrigen = 0;
        dijkstra(mapa, estacionOrigen);
    }
}
