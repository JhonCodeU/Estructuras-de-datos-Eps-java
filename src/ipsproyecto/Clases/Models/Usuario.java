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
public class Usuario {

    private String Cedula;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Correo;
    private static Usuario[] objUsuario = new Usuario[20];

    public Usuario() {
    }

    public Usuario(String Cedula, String Nombre, String Direccion, String Telefono, String Correo) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public static Usuario[] getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objectUsuario) {
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

}
