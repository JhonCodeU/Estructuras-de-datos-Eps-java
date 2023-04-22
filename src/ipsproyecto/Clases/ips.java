/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsproyecto.Clases;

/**
 *
 * @author Jhond
 */
public class ips {
    private String Nit;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String FechaFundacion;
    private String Sede;
    private static ips[] objIps = new ips[20];

    public ips() {
    }

    public ips(String Nit, String Nombre, String Direccion, String Telefono, String FechaFundacion, String Sede) {
        this.Nit = Nit;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.FechaFundacion = FechaFundacion;
        this.Sede = Sede;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
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

    public String getFechaFundacion() {
        return FechaFundacion;
    }

    public void setFechaFundacion(String FechaFundacion) {
        this.FechaFundacion = FechaFundacion;
    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String Sede) {
        this.Sede = Sede;
    }
    
    public void setObjIps(ips objectIps) {
        for (int i = 0; i < this.objIps.length; i++) {
            if (this.objIps[i] == null) {
                this.objIps[i] = objectIps;
                break;
            }
        }
    }
    public void recorrerIps() {
        for (int i = 0; i < this.objIps.length; i++) {
            System.out.println(i + " " + objIps[i]);
        }
    }
}
