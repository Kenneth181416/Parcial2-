/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Andres Ibarra
 */
abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public boolean estaViva() {
        return salud > 0;
    }

    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int dano);

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }
}