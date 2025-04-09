/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

class Dragon extends Criatura {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dano = fuerza * 2;
        System.out.println(nombre + " lanza fuego a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        objetivo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        salud -= dano / 2; // Reduce el daño recibido a la mitad
        System.out.println(nombre + " se defiende con sus escamas. Salud restante: " + salud);
    }
}