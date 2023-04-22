/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsproyecto.Clases;

import ipsproyecto.Clases.Models.Paciente;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateo
 */
public class Turno {

    private String Id;
    private String Tipo;
    private Date fecha;
    private Paciente Usuario;
    private static ArrayList<Turno> listaTurnosMedicamento = new ArrayList<Turno>();
    private static ArrayList<Turno> listaTurnosCitas = new ArrayList<Turno>();

    public Turno() {
    }

    public Turno(String Id, String Tipo, Date fecha, Paciente Usuario) {
        this.Id = Id;
        this.Tipo = Tipo;
        this.fecha = fecha;
        this.Usuario = Usuario;
    }

    public ArrayList<Turno> getListaTurnosCitas() {
        return listaTurnosCitas;
    }

    public void setListaTurnosCitas(Turno listaTurnosCitas) {
        Turno.listaTurnosCitas.add(listaTurnosCitas);
    }

    public void desencolarTurnosCita() {
        if (listaTurnosCitas.size() > 0) {
            JOptionPane.showMessageDialog(null, "Turno " + listaTurnosCitas.get(0).Id + " esta siendo atendido");
            listaTurnosCitas.remove(0);
        } else {

            JOptionPane.showMessageDialog(null, "NO hay más turnos en la cola");
        }
    }

    public ArrayList<Turno> getListaTurnosMedicamento() {
        return listaTurnosMedicamento;
    }

    public void setListaTurnosMedicamentos(Turno list) {
        System.out.println(list.getUsuario().getNombre() + listaTurnosMedicamento.size());
        listaTurnosMedicamento.add(list);
    }

    public void recorrerTurno() {
        for (int i = 0; i < this.listaTurnosMedicamento.size(); i++) {
            System.out.println("Guardo " + i);
        }
    }

    public Paciente getUsuario() {
        return Usuario;
    }

    public void setUsuario(Paciente Usuario) {
        this.Usuario = Usuario;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
