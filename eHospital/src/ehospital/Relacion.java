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
public class Relacion extends Relacion_a_vecino {

    public Relacion(int nivel, Lugar to) {
        super(nivel, to);
    }

    @Override
    public Lugar getTo() {
        return to;
    }

    @Override
    public int getLevel() {
        return nivel;
    }

    @Override
    public String toString() {
        return super.to.getNombre();
    }
}
