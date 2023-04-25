package ipsproyecto.Clases.funciones;

import java.util.Scanner;

import ipsproyecto.Clases.Models.Paciente;

public class LeerPaciente {

  public static Paciente scannerPaciente(Scanner scanner) {
    System.out.println("Registro de pacientes");

    scanner.nextLine();
    System.out.println("Ingrese su cedula: ");
    String cedula = scanner.nextLine();
    System.out.println("Ingrese su nombre: ");
    String name = scanner.nextLine();
    System.out.println("Ingrese su apellido: ");
    String lastName = scanner.nextLine();
    System.out.println("Ingrese su edad: ");
    Integer age = scanner.nextInt();
    System.out.println("Ingrese su telefono: ");
    String phone = scanner.nextLine();
    System.out.println("Ingrese su condiccion");
    String condition = scanner.nextLine();

    RegistroPacientes registropaciente = RegistroPacientes.getInstancia();
    Paciente paciente = new Paciente(cedula, name, lastName, phone, age, condition);
    registropaciente.agregarPaciente(paciente);

    System.out.println(paciente.getNombre());

    System.out.println("Su registro ha sido exitoso");

    return paciente;
  }
}
