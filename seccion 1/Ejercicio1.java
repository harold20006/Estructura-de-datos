import java.util.Scanner;

public class Ejercicio1 {
    static int mayor = 0;
    static int menor = 0;
 public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int[] numeros = new int[5];
    for (int i=0; i<5; i++){
        System.out.println("ingrese el " + (i+1) + " numero");
        numeros[i] = sn.nextInt();
    }
    for (int i=0; i<5; i++){
        if (i==0){
            mayor = numeros[i];
            menor = numeros[i];
        }
        if (numeros[i] > mayor){
            mayor = numeros[i];
        }
        if (numeros[i] < menor){
            menor = numeros[i];
        }
    }
        System.out.println("el numero mayor es: " + mayor);
        System.out.println("el numero menor es: " + menor);
        sn.close();
    }
}