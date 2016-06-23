/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehospital;

/**
 *
 * @author jordi
 */
public class Paramedicos {
    public String nombre;
    public int edad;
    public int id;
    public String ranking;
    public Lugar compl_asignado;
    public boolean disponible;

    public Paramedicos() {
    }

    
    public Paramedicos(String nombre, int edad, int id, String ranking, Lugar compl_asignado, boolean disponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.ranking = ranking;
        this.compl_asignado = compl_asignado;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public Lugar getCompl_asignado() {
        return compl_asignado;
    }

    public void setCompl_asignado(Lugar compl_asignado) {
        this.compl_asignado = compl_asignado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
    @Override
    public String toString() {
        return nombre;
    }

    
    
}
