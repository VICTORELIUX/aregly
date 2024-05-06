public class Arreglo {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("El elemento de indice 0: " + numeros[0]);
        System.out.println("El elemento de indice 1: " + numeros[1]);
        System.out.println("El elemento de indice 2: " + numeros[2]);
        System.out.println("El elemento de indice 3: " + numeros[3]);
        System.out.println("El elemento de indice 4: " + numeros[4]);
        // Suma simple
        int suma = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
        System.out.println("La suma de los numeros de array es de: " + suma);
        // Suma con un ciclo for
        int sumafor = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumafor += numeros[i];
        }
        System.out.println("La suma con ciclo for es de: " + sumafor);
        // Imprimir los valores del array con for
        for (int j = 0; j < numeros.length; j++) {
            System.out.println("Los numeros del array son: " + j + numeros[j]);
        }
    }
}