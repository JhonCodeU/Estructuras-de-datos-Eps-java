/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipsproyecto.Clases.funciones;

import ipsproyecto.Clases.Models.Paciente;
import ipsproyecto.Clases.colas.GestionTurnos;

/**
 *
 * @author johnca
 */
public class Menu {

  private GestionTurnos gestionTurnos = GestionTurnos.getInstancia();

  public void initDatosPruebaTurnos() {
    // agregar usuarios a la cola
    RegistroPacientes registroPacientes = RegistroPacientes.getInstancia();
    if (!registroPacientes.getUseDatosDePrueba()) {
      for (Paciente paciente : registroPacientes.obtenerListaPacientes()) {
        gestionTurnos.agregarPaciente(paciente);
      }
    }
    registroPacientes.setUseDatosDePrueba(true);
  }
}
