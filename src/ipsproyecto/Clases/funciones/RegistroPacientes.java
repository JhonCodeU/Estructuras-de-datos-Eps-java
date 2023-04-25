/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipsproyecto.Clases.funciones;

/**
 *
 * @author johnca
 */
import ipsproyecto.Clases.Models.Paciente;

import java.util.ArrayList;

public class RegistroPacientes {
    private static RegistroPacientes instacia = null;
    private ArrayList<Paciente> colaPacientes;
    private Boolean useDatosDePrueba = false;

    // Patron Singleton

    public static RegistroPacientes getInstancia() {
        if (instacia == null) {
            instacia = new RegistroPacientes();
            instacia.datosDePrueba();
        }
        return instacia;
    }

    public RegistroPacientes() {
        colaPacientes = new ArrayList<Paciente>();
    }

    public void agregarPaciente(Paciente paciente) {
        colaPacientes.add(paciente);
        System.out.println("Paciente almacenado con éxito");
    }

    // obtener la lista de pacientes
    public ArrayList<Paciente> obtenerListaPacientes() {
        return colaPacientes;
    }

    public Boolean getUseDatosDePrueba() {
        return useDatosDePrueba;
    }

    public void setUseDatosDePrueba(Boolean useDatosDePrueba) {
        this.useDatosDePrueba = useDatosDePrueba;
    }

    public void datosDePrueba() {
        // crear usuarios de prueba
        Paciente paciente1 = new Paciente("1001", "Juan", "Perez", "82-11111111", 78, "Diabetis");
        Paciente paciente2 = new Paciente("1002", "Maria", "Gonzalez", "82-22222222", 43, "");
        Paciente paciente3 = new Paciente("1003", "Pedro", "Gomez", "82-33333333", 65, "");
        Paciente paciente4 = new Paciente("1004", "Jose", "Rodriguez", "82-44444444", 32, "Colesterol");
        // agregar usuarios a la lista
        colaPacientes.add(paciente1);
        colaPacientes.add(paciente2);
        colaPacientes.add(paciente3);
        colaPacientes.add(paciente4);
    }
}
