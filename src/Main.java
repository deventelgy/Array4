import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        /*2.- Ingresar tamaño del arreglo. por teclado los valores y En un arreglo,
         mostrar los datos de cada usuario ( nombre, edad y sexo).
         */

        String N = JOptionPane.showInputDialog("Ingrese el tamaño de datos");
        int tamanio=Integer.parseInt(N);

        String name;
        int edad;
        char genero;

        String names[] = new String[tamanio];
        int edades[] = new int[tamanio];
        char generos[] = new char[tamanio];

        for(int i=0;i<tamanio;i++){
            names[i] = JOptionPane.showInputDialog("Ingresa el nombre: ");

            String ed = JOptionPane.showInputDialog("Igrese su edad: ");
            edades[i] = Integer.parseInt(ed);

            String gen = JOptionPane.showInputDialog("Ingrese su Sexo: ");
            generos[i]  = gen.charAt(0);
        }
        System.out.println("Los datos son:\n");
        System.out.println("Nombre   | Edades | Generos");
        System.out.println("----------------------------");

        for(int i=0;i<tamanio;i++){
            System.out.println("Nombre "+names[i]+"=>"+edades[i]+" = "+generos[i]);
        }
    }
}