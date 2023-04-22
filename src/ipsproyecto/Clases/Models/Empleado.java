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
public class Empleado {
    
    private String Cedula;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Correo;
    private String Cargo;
    private String Estado;
    private static Empleado[] objEmpleado = new Empleado[5];
    public Empleado() {
    }

    public Empleado[] getObjEmpleado() {
        return objEmpleado;
    }

    
    public void setObjEmpleado(Empleado objectEmpleado) {
        for (int i = 0; i < this.objEmpleado.length; i++) {
            if (this.objEmpleado[i] == null) {
                this.objEmpleado[i] = objectEmpleado;
                break;
            }
        }
    }
    public void recorrerEmpleado() {
        for (int i = 0; i < this.objEmpleado.length; i++) {
            System.out.println(i + " " + objEmpleado[i]);
        }
    }

    public Empleado(String Cedula, String Nombre, String Direccion, String Telefono, String Correo, String Cargo, String Estado) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Cargo = Cargo;
        this.Estado = Estado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
   
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
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

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
    
}
