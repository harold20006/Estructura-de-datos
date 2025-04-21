#include <iostream>
#include <fstream>
#include <stack>
#include <sstream>
#include <string>
#include "encabezado.c++"

struct Registro {
    std::string hora;
    double consumo;
};

void cargarRegistrosDesdeArchivo(const std::string& archivo, std::stack<Registro>& pila) {
    std::ifstream file(archivo);
    if (!file.is_open()) {
        std::cerr << "Error al abrir el archivo." << std::endl;
        return;
    }

    std::string linea;
    while (getline(file, linea)) {
        std::istringstream ss(linea);
        Registro registro;
        ss >> registro.hora >> registro.consumo;

        pila.push(registro);
    }

    file.close();
}

void mostrarRegistrosEnOrdenInverso(std::stack<Registro>& pila) {
    std::stack<Registro> pilaInvertida = pila;

    while (!pilaInvertida.empty()) {
        Registro registro = pilaInvertida.top();
        pilaInvertida.pop();

        std::cout << "Hora: " << registro.hora << " | Consumo: " << registro.consumo << " kW" << std::endl;

        // Generar alerta si el consumo supera los 550 kW
        if (registro.consumo > 550.0) {
            std::cout << "¡ALERTA! Consumo superior a 550 kW." ;
        }
    }
}

int main() {
    imprimirencabezado();  // Llamada a la función para imprimir el encabezado
    std::stack<Registro> pilaDeRegistros;
    std::string archivo = "consumo.txt";  // Nombre del archivo de entrada

    cargarRegistrosDesdeArchivo(archivo, pilaDeRegistros);
    mostrarRegistrosEnOrdenInverso(pilaDeRegistros);

    return 0;
}