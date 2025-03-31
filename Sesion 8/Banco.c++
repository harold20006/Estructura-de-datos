#include <iostream>
#include <queue>
#include <thread>
#include <mutex>
#include <chrono>
include "Encabezado.c++"
using namespace std;
 
queue<string> transacciones;
mutex mtx;
 
void productor() {
    for (int i = 1; i <= 5; ++i) {
        this_thread::sleep_for(chrono::milliseconds(500));
        lock_guard<mutex> lock(mtx);
        string trans = "Transaccion #" + to_string(i);
        transacciones.push(trans);
        cout << "Producida: " << trans << endl;
    }
}
 
void consumidor() {
    for (int i = 1; i <= 5; ++i) {
        this_thread::sleep_for(chrono::milliseconds(800));
        lock_guard<mutex> lock(mtx);
        if (!transacciones.empty()) {
            cout << "Procesada: " << transacciones.front() << endl;
            transacciones.pop();
        }
    }
}
 
int main() {
    imprimirencabezado();
    thread t1(productor);
    thread t2(consumer);
    t1.join();
    t2.join();
    return 0;
}
