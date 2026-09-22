/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vectores;
import java.util.Scanner;

public class Vectores {
    static Scanner sc = new Scanner(System.in);

    static int opc;
    static int tam;

    static String[] nom;
    static String[] ape;
    static double[] sal;
    static int[] dt;
    static double[] tp;

    public static void main(String[] args) {

        System.out.print("Digite Cantidad de Usuarios: ");
        tam = sc.nextInt();

        nom = new String[tam];
        ape = new String[tam];
        sal = new double[tam];
        dt = new int[tam];
        tp = new double[tam];

        menu();
    }

    static void menu() {

        System.out.println("\n************ MENU ************");
        System.out.println("1. Capturar");
        System.out.println("2. Consultar");
        System.out.println("3. Salir");
        System.out.print("Digite su opcion: ");
        opc = sc.nextInt();

        switch (opc) {

            case 1:
                capturar();
                break;

            case 2:
                consultar();
                break;

            case 3:
                System.out.println("Programa finalizado....");
                break;

            default:
                System.out.println("Opcion incorrecta");
                menu();
        }
    }

    static void capturar() {

        System.out.println("\n===== CAPTURA DE EMPLEADOS =====");

        for (int i = 0; i < tam; i++) {
            System.out.println("\nEmpleado " + i);

            System.out.print("Digite Nombre: ");
            nom[i] = sc.next();

            System.out.print("Digite Apellido: ");
            ape[i] = sc.next();

            System.out.print("Digite Salario Mensual: ");
            sal[i] = sc.nextDouble();

            System.out.print("Digite Dias Trabajados: ");
            dt[i] = sc.nextInt();

            tp[i] = (sal[i] / 30) * dt[i];
        }

        System.out.println("\nDatos guardados correctamente.");
        menu();
    }

    static void consultar() {

        System.out.println("\n******** MENU CONSULTA ********");
        System.out.println("1. Consulta General");
        System.out.println("2. Consulta Individual");
        System.out.println("3. Mostrar Atributos");
        System.out.println("4. Regresar");
        System.out.print("Digite su opcion: ");

        opc = sc.nextInt();

        switch (opc) {

            case 1:

                System.out.println("\nID\tNombre\tApellido\t\tSalario\t\tDias\tTotal");

                for (int i = 0; i < tam; i++) {

                    System.out.println(
                    i + "\t" + nom[i] + "\t" + ape[i] +"\t" + "\t" + sal[i] + "\t" + dt[i] + "\t" + tp[i]);
                    }

                consultar();
                break;

            case 2:

                System.out.print("Digite la posicion a consultar: ");
                int pos = sc.nextInt();

                if (pos >= 0 && pos < tam) {

                    System.out.println("\nEmpleado: " + pos);
                    System.out.println("Nombre: " + nom[pos]);
                    System.out.println("Apellido: " + ape[pos]);
                    System.out.println("Salario: " + sal[pos]);
                    System.out.println("Dias Trabajados: " + dt[pos]);
                    System.out.println("Total a Pagar: " + tp[pos]);

                } else {

                    System.out.println("Posicion no valida:(");
                }

                consultar();
                break;

            case 3:

                mostrarAtributos();
                break;

            case 4:

                menu();
                break;

            default:

                System.out.println("Opcion incorrecta.");
                consultar();
        }
    }

    static void mostrarAtributos() {

        System.out.println("\n***** MOSTRAR ATRIBUTOS *****");
        System.out.println("1. Nombre");
        System.out.println("2. Apellido");
        System.out.println("3. Salario");
        System.out.println("4. Dias Trabajados");
        System.out.println("5. Total a Pagar");
        System.out.print("Digite una opcion: ");

        int op = sc.nextInt();

        switch (op) {

            case 1:

                System.out.println("\nID\tNombre");

                for (int i = 0; i < tam; i++) {
                    System.out.println(i + "\t" + nom[i]);
                }
                break;

            case 2:

                System.out.println("\nID\tApellido");

                for (int i = 0; i < tam; i++) {
                    System.out.println(i + "\t" + ape[i]);
                }
                break;

            case 3:

                System.out.println("\nID\tSalario");

                for (int i = 0; i < tam; i++) {
                    System.out.println(i + "\t" + sal[i]);
                }
                break;

            case 4:

                System.out.println("\nID\tDias");

                for (int i = 0; i < tam; i++) {
                    System.out.println(i + "\t" + dt[i]);
                }
                break;

            case 5:

                System.out.println("\nID\tTotal");

                for (int i = 0; i < tam; i++) {
                    System.out.println(i + "\t" + tp[i]);
                }
                break;

            default:

                System.out.println("Opcion incorrecta.");
        }

        consultar();
    }
}
