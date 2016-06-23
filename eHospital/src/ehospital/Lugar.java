/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehospital;

import java.util.ArrayList;

/**
 *
 * @author jordi
 */
public class Lugar {

    public String nombre;
    public String direccion;
    public String tipo;
    public int cap_param;
    public int cap_ambu;
    public ArrayList ranking = new ArrayList();
    public ArrayList<Paramedicos> paramedicos_asignados = new ArrayList(cap_param);
    public ArrayList<Ambulancias> ambulancias_asignados = new ArrayList(cap_ambu);
    public ArrayList<Vecinos> vecinos = new ArrayList();

    public Lugar() {
    }

    public Lugar(String nombre) {
        this.nombre = nombre;
    }
    

    public Lugar(String nombre, String direccion, String tipo, int cap_param, int cap_ambu, ArrayList ranking) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
        this.cap_param = cap_param;
        this.cap_ambu = cap_ambu;
        this.ranking = ranking;
    }

    public Lugar(String nombre, String tipo, ArrayList Vecinos) {
        this.nombre = nombre;
        this.tipo = tipo;
        vecinos = new ArrayList<Vecinos>();
    }

    public Lugar(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Lugar(String nombre, String direccion, String tipo, int cap_param, int cap_ambu, ArrayList ranking, ArrayList paramedicos_asignados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
        this.cap_param = cap_param;
        this.cap_ambu = cap_ambu;
        this.ranking = ranking;
        this.paramedicos_asignados = new ArrayList(cap_param);

    }

    public Lugar(String nombre, String direccion, String tipo, int cap_param, int cap_ambu, ArrayList ranking, ArrayList paramedicos_asignados, ArrayList ambulancias_asignados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
        this.cap_param = cap_param;
        this.cap_ambu = cap_ambu;
        this.ranking = ranking;
        this.paramedicos_asignados = paramedicos_asignados;
        this.ambulancias_asignados = ambulancias_asignados;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCap_param() {
        return cap_param;
    }

    public void setCap_param(int cap_param) {
        this.cap_param = cap_param;
    }

    public int getCap_ambu() {
        return cap_ambu;
    }

    public void setCap_ambu(int cap_ambu) {
        this.cap_ambu = cap_ambu;
    }

    public ArrayList getRanking() {
        return ranking;
    }

    public void setRanking(ArrayList ranking) {
        this.ranking = ranking;
    }

    public ArrayList<Paramedicos> getParamedicos_asignados() {
        return paramedicos_asignados;
    }

    public void setParamedicos_asignados(ArrayList<Paramedicos> paramedicos_asignados) {
        this.paramedicos_asignados = paramedicos_asignados;
    }

    public ArrayList<Ambulancias> getAmbulancias_asignados() {
        return ambulancias_asignados;
    }

    public void setAmbulancias_asignados(ArrayList<Ambulancias> ambulancias_asignados) {
        this.ambulancias_asignados = ambulancias_asignados;
    }

    public ArrayList<Vecinos> getVecinos() {
        return vecinos;
    }

    public void setVecinos(ArrayList<Vecinos> vecinos) {
        this.vecinos = vecinos;
    }

    
    @Override
    public String toString() {        
            return nombre ;
        
    }

    

}
