package ipsproyecto.Clases.funciones;

import javax.swing.JOptionPane;

import ipsproyecto.Clases.Models.Paciente;
import ipsproyecto.Clases.colas.GestionTurnos;

public class SolicitarTurno {

  public static void solicitarTurno(Paciente paciente) {

    GestionTurnos gestionTurnos = new GestionTurnos();

    if (paciente == null) {
      JOptionPane.showMessageDialog(null, "No se ha seleccionado un paciente");
      return;
    }

    gestionTurnos.agregarPaciente(paciente);
    String turno = gestionTurnos.obtenerTurno(paciente.getCedula());
    JOptionPane.showMessageDialog(null, "Su turno es: " + turno);
  }
}
