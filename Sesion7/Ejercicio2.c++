#include <iostream>
#include <stack>
#include "encabezado.c++"
using namespace std;

bool validarExpresion(string expr){
    stack<char> pila;
    for (char c : expr)
    {
        if (c == '(')
        {
            pila.push(c);
        }
        else if (c == ')')
        {
            if (pila.empty())
                return false;
            pila.pop();
        }
    }
    return pila.empty();
}

int main(){
    imprimirencabezado();
    string expresion = "(5+3)*(2+(4-1))";
    if (validarExpresion(expresion))
        cout << "Expresión válida." << endl;
    else
        cout << "Expresión inválida." << endl;
    return 0;
}
