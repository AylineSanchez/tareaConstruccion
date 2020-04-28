/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaconstruccion;

/**
 *
 * @author Aylinee
 */
public class Medicina {
    public String nombre;
    public String descripcion;
    public String presentación;
    public String precio;

    public Medicina(String nombre, String descripcion, String presentación, String precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.presentación = presentación;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresentación() {
        return presentación;
    }

    public void setPresentación(String presentación) {
        this.presentación = presentación;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
}
