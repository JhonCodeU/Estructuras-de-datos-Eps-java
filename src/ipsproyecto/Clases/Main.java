package ipsproyecto.Clases;

import java.util.Scanner;

import ipsproyecto.Clases.funciones.Menu;
import ipsproyecto.Clases.funciones.SolicitarTurno;
import ipsproyecto.Clases.Models.Paciente;
import ipsproyecto.Clases.colas.GestionTurnos;
import ipsproyecto.Clases.funciones.LeerPaciente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author johnca
 */
public class Main {

    public static void main(String[] args) {
        // variables globales
        Scanner scanner = new Scanner(System.in);

        // Inicializar datos de prueba
        Menu menu = new Menu();
        menu.initDatosPruebaTurnos();
        Paciente pacienteGlobal = null;
        Boolean salir = false;

        pacienteGlobal = new Paciente("123", "John", "Cabrera", "123", 20, "");

        while (!salir) {
            System.out.println("----------------------------------");
            System.out.println("Bienvenido al sistema de EPS");
            System.out.println("----------------------------------");
            System.out.println("1. Registro de pacientes");
            System.out.println("2. Solicitud de turnos");
            System.out.println("3. Lista de turnos");
            System.out.println("4. Atender el primero de la cola");
            System.out.println("5. Salir");
            System.out.println("----------------------------------");
            System.out.println("Ingrese una opción: ");

            Integer opt = scanner.nextInt();
            Paciente paciente = opciones(opt, scanner, pacienteGlobal);
            if (paciente != null) {
                pacienteGlobal = paciente;
            }

            if (opt == 5) {
                salir = true;
            }
        }
        scanner.close();
    }

    public static Paciente opciones(Integer opt, Scanner scanner, Paciente paciente) {
        System.out.println();
        GestionTurnos turnos = GestionTurnos.getInstancia();
        switch (opt) {
            case 1:
                paciente = LeerPaciente.scannerPaciente(scanner);
                break;
            case 2:
                System.out.println("Solicitud de turnos");
                SolicitarTurno.solicitarTurno(paciente);
                break;
            case 3:
                System.out.println("Lista de turnos");
                turnos.mostrarTurnos();
                System.out.println();
                pausar();
                break;
            case 4:
                System.out.println("Atender el primero de la cola");
                Paciente pacienteAtendido = turnos.extraerPaciente();
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Paciente atendido: " + pacienteAtendido.getNombre());
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                turnos.mostrarTurnos();
                pausar();
                break;
            case 5:
                System.out.println("Saliendo del sistema");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return paciente;
    }

    // Pausar el programa
    public static void pausar() {
        System.out.println("Presione enter para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}