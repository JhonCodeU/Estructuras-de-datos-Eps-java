/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsproyecto.Clases.Models;

/**
 *
 * @author Johnd
 */
public class Paciente {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String telefono;
    private Integer edad;
    private String condicionEspecial;
    private String turno;

    public Paciente(String cedula, String nombre, String apellidos, String telefono, Integer edad,
            String condicionEspecial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.edad = edad;
        this.condicionEspecial = condicionEspecial;
    }

    // Método para obtener la letra correspondiente al tipo de paciente
    public String getTipoPaciente() {
        if (this.condicionEspecial != "") {
            return "A";
        } else if (this.edad > 62) {
            return "B";
        } else {
            return "C";
        }
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCondicionEspecial() {
        return condicionEspecial;
    }

    public void setCondicionEspecial(String condicionEspecial) {
        this.condicionEspecial = condicionEspecial;
    }

    // Método para obtener el número correspondiente al turno
    public String getNumeroTurno() {
        return this.turno;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTelefono() {
        return telefono;
    }
}
