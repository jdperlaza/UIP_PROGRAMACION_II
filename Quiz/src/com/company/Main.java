package com.company;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        String opcion;
        opcion = "s";
        int c1=0, c2=0, c3=0;

        while ("S".equals(opcion) || "s".equals(opcion)) {
        System.out.println("\t\tCURSOS DISPONIBLES\n");
        System.out.println("1) PROGRAMACION EN C++\n2) PROGRAMACION EN PYTHON\n3) PROGRAMACION JAVA");
        System.out.println("EN CUAL DESEA MATRICULARSE");

        double curso = escaner.nextDouble();
            String nombre= escaner.next();






        switch ((int) curso) {
            case 1:
                c1 = c1 + 1;
                System.out.println("USTED SELECCIONO\nPROGRAMACION EN C++");
                System.out.println("PARA INGRESAR A EL CURSO INGRESE LOS SIGUENTES DATOS");
                System.out.println("NOMBRE");
                nombre = escaner.next();
                System.out.println("APELLIDO");
                String apellido = escaner.next();
                System.out.println("CEDULA");
                String cedula = escaner.next();
                System.out.println("YA ESTAS MATRICULADO EN EL CUERSO EN LINEA\nPROGRAMACION EN C++");
                break;
            case 2:
                c2 = c2 + 1;
                System.out.println("USTED SELECCIONO\nPROGRAMACION EN PHYTON");
                System.out.println("PARA INGRESAR A EL CURSO INGRESE LOS SIGUENTES DATOS");
                System.out.println("NOMBRE");
                String nombre2 = escaner.next();
                System.out.println("APELLIDO");
                String apellido2 = escaner.next();
                System.out.println("CEDULA");
                String cedula2 = escaner.next();
                System.out.println("YA ESTAS MATRICULADO EN EL CUERSO EN LINEA\nPROGRAMACION EN PHYTON");
                break;
            case 3:
                c3 = c3 + 1;
                System.out.println("USTED SELECCIONO\nPROGRAMACION EN JAVA");
                System.out.println("PARA INGRESAR A EL CURSO INGRESE LOS SIGUENTES DATOS");
                System.out.println("NOMBRE");
                String nombre3 = escaner.next();
                System.out.println("APELLIDO");
                String apellido3 = escaner.next();
                System.out.println("CEDULA");
                String cedula3 = escaner.next();
                System.out.println("YA ESTAS MATRICULADO EN EL CUERSO EN LINEA\nPROGRAMACION EN JAVA");
                break;
        }
            System.out.print("Desea continuar (S/N): ");
            opcion = escaner.next();


        }System.out.println("FINAL DE LAS INSCRIPCIONES");
        System.out.println("PROGRAMACION EN C++ "+c1+" ALUMNOS\nPROGRAMACION EN PHYTON "+c2+" ALUMNOS" +
                "\nPROGRAMACION JAVA "+c3+" ALUMNOS");
        System.out.println("Hay un total de "+(c1+c2+c3)+" ALUMNOS MATRICULADOS");




    }

}
