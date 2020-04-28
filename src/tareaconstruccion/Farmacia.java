/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaconstruccion;

import java.util.ArrayList;

/**
 *
 * @author Aylinee
 */
public class Farmacia {
    public String nombre;
    public String franquicia;
    public String dirección;
    public String teléfono;
    public ArrayList<Medicina> medicinas = new  ArrayList<>();

    public Farmacia(String nombre, String franquicia, String dirección, String teléfono, ArrayList<Medicina> medicinas) {
        this.nombre = nombre;
        this.franquicia = franquicia;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.medicinas = medicinas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public ArrayList<Medicina> getMedicinas() {
        return medicinas;
    }

    public void setMedicinas(ArrayList<Medicina> medicinas) {
        this.medicinas = medicinas;
    }

    
    
}
