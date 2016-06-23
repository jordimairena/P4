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
public class Ambulancias {
    public String placa;
    public int ano;
    public int velocidad;
    public Lugar compl_asignado;
    public boolean disponible;

    public Ambulancias() {
    }

    public Ambulancias(String placa, int ano, int velocidad, Lugar compl_asignado, boolean disponible) {
        this.placa = placa;
        this.ano = ano;
        this.velocidad = velocidad;
        this.compl_asignado = compl_asignado;
        this.disponible = disponible;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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
        return "placa=" + placa;
    }
    
    
}
