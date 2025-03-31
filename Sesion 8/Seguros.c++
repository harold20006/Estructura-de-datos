#include <iostream>
#include <queue>
#include <string>
#include "encabezado01.c++"
using namespace std;
 
struct Siniestro {
    string descripcion;
    int prioridad;
    bool operator<(const Siniestro& otro) const {
        return prioridad < otro.prioridad;
    }
};
 
int main() {
    imprimirencabezado();
    priority_queue<Siniestro> cola;
    cola.push({"Robo leve", 1});
    cola.push({"Incendio", 3});
    cola.push({"Accidente vial", 2});
 
    while (!cola.empty()) {
        cout << "Procesando: " << cola.top().descripcion << endl;
        cola.pop();
    }
    return 0;
}
