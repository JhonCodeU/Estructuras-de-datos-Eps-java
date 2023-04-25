/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipsproyecto.Clases.colas;

import java.util.ArrayList;
import ipsproyecto.Clases.Models.Paciente;

/**
 *
 * @author johnca
 */

public class GestionTurnos {
  private Nodo inicioCola, finalCola;
  private int tamano;

  public GestionTurnos() {
    inicioCola = null;
    finalCola = null;
  }

  // Metodo para saber si la cola esta vacia
  public boolean colaVacia() {
    if (inicioCola == null) {
      return true;
    } else {
      return false;
    }
  }

  // Metodo para insertar en la cola y comprobar la prioridad del paciente
  public void agregarPaciente(Paciente paciente) {
    // System.out.println("Agregando paciente: " + paciente.getNombre());
    Nodo nuevoNodo = new Nodo();
    nuevoNodo.objeto = paciente;
    nuevoNodo.siguiente = null;
    if (colaVacia()) {
      inicioCola = nuevoNodo;
      finalCola = nuevoNodo;
    } else {
      finalCola.siguiente = nuevoNodo;
      finalCola = nuevoNodo;
    }
    tamano++;
  }

  // Extraer de la cola
  public Paciente extraerPaciente() {
    if (!colaVacia()) {
      Paciente valor = inicioCola.objeto;
      if (inicioCola == finalCola) {
        inicioCola = null;
        finalCola = null;
      } else {
        inicioCola = inicioCola.siguiente;
      }
      return valor;
    } else {
      return null;
    }
  }

  // Metodo para mostrar los elementos de la cola
  public Nodo mostrarTurnos() {
    ordenarPorPrioridad();

    if (inicioCola == null) {
      return null;
    }
    return inicioCola;

    // System.out.println("Mostrando turnos");

    // ver en consola
    /*
     * while (recorrido != null) {
     * System.out.println(" Nombre: " + recorrido.objeto.getNombre()
     * + " Prioridad: " + recorrido.objeto.getTipoPaciente());
     * recorrido = recorrido.siguiente;
     * }
     */
  }

  // Tamano de la cola
  public int tamanoCola() {
    return tamano;
  }

  // Método para ordenar la cola por prioridad
  public void ordenarPorPrioridad() {
    ArrayList<Paciente> listaTemporal = new ArrayList<Paciente>();
    ArrayList<Paciente> listaTipoB = new ArrayList<Paciente>();
    ArrayList<Paciente> listaTipoC = new ArrayList<Paciente>();
    // Encola los pacientes organizados por prioridad en la lista temporal
    while (!colaVacia()) {
      Paciente paciente = extraerPaciente();
      if (paciente.getTipoPaciente().equals("C")) {
        paciente.setTurno(paciente.getTipoPaciente() + " - " + (listaTipoC.size() + 1));
        listaTipoC.add(paciente);
      } else if (paciente.getTipoPaciente().equals("B")) {
        paciente.setTurno(paciente.getTipoPaciente() + " - " + (listaTipoB.size() + 1));
        listaTipoB.add(paciente);
      } else {
        paciente.setTurno(paciente.getTipoPaciente() + " - " + (listaTemporal.size() + 1));
        listaTemporal.add(paciente);
      }
    }

    listaTemporal.addAll(listaTipoB);
    listaTemporal.addAll(listaTipoC);

    // Encola los pacientes organizados por prioridad en la cola original
    for (Paciente paciente : listaTemporal) {
      agregarPaciente(paciente);
    }

    // Limpia la lista temporal
    listaTemporal.clear();
  }

  // Método para obtener el turno de un paciente
  public String obtenerTurno(String cedula) {
    ordenarPorPrioridad();
    Nodo recorrido = inicioCola;
    while (recorrido != null) {
      if (recorrido.objeto.getCedula().equals(cedula)) {
        return recorrido.objeto.getTurno();
      }
      recorrido = recorrido.siguiente;
    }
    return null;
  }
}