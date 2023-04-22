/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsproyecto.Clases.Models;

/**
 *
 * @author Mateo
 */
public class Paciente {

    private String Cedula;
    private String Nombre;
    private String Apellidos;
    private String Telefono;
    private String Edad;
    private static Paciente[] objUsuario = new Paciente[20];

    public Paciente() {
    }

    public Paciente(String Cedula, String Nombre, String Apellidos, String Telefono, String Edad) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.Edad = Edad;
    }
    
    

    public static Paciente[] getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Paciente objectUsuario) {
        for (int i = 0; i < this.objUsuario.length; i++) {
            if (this.objUsuario[i] == null) {
                this.objUsuario[i] = objectUsuario;
                break;
            }
        }
    }

    public void recorrerUsuario() {
        for (int i = 0; i < this.objUsuario.length; i++) {
            System.out.println(i + " " + objUsuario[i]);
        }
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
    

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

}
