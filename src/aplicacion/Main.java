package aplicacion;

import java.time.LocalDateTime;
import java.util.Scanner;
import dominio.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcion;

        /* Ticket t1 = new Ticket("1234ABC", 1, LocalDateTime.now(), 60);
        Ticket t2 = new Ticket("9876DEF", 2, LocalDateTime.now(), 30);

        agenda.add(t1);
        agenda.add(t2); */

        do {
            System.out.println("<<<< MENÚ DE TICKETS >>>>");
            System.out.println("1. Registrar ticket");
            System.out.println("2. Filtrar vencidos por zona");
            System.out.println("3. Filtrar activos por zona");
            System.out.println("4. Mostrar agenda completa");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer.

            switch (opcion) {
                case 1:
                    System.out.print("Introduce matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Introduce zona: ");
                    int zona = sc.nextInt();

                    System.out.print("Introduce duración en minutos: ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    Ticket t = new Ticket(matricula, zona, LocalDateTime.now(), duracion);
                    agenda.add(t);
                    System.out.println("Ticket registrado correctamente.\n");
                    break;

                case 2:
                    System.out.print("Introduce zona: ");
                    int zV = sc.nextInt();
                    sc.nextLine();

                    Agenda vencidosZona = agenda.filtrarVencidos(zV);
                    System.out.println("<<< Tickets vencidos en zona " + zV + " >>>");
                    System.out.println(vencidosZona);
                    break;

                case 3:
                    System.out.print("Introduce zona: ");
                    int zA = sc.nextInt();
                    sc.nextLine();

                    Agenda activosZona = agenda.filtrarActivos(zA);
                    System.out.println("<<< Tickets activos en zona " + zA + " >>>");
                    System.out.println(activosZona);
                    break;

                case 4:
                    System.out.println("<<< Agenda completa >>>");
                    System.out.println(agenda);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
            
        /* Agenda vencidosZona2 = agenda.filtrarVencidos(2);
        Agenda activosZona1 = agenda.filtrarActivos(1);

        System.out.println("<<< Agenda completa >>>");
        System.out.println(agenda);

        System.out.println("<<< Tickets vencidos en la zona 2 >>>");
        System.out.println(vencidosZona2);

        System.out.println("<<< Tickets activos en la zona 1 >>>");
        System.out.println(activosZona1); */
    }
}