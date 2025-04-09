/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

// Clase para simular la batalla
class Batalla {
    public static void simular(Criatura c1, Criatura c2) {
        System.out.println("\n¡Batalla entre " + c1.getNombre() + " y " + c2.getNombre() + " comienza!\n");

        int turno = 1;
        while (c1.estaViva() && c2.estaViva()) {
            System.out.println("Turno " + turno + ":");
            c1.atacar(c2);
            if (c2.estaViva()) {
                c2.atacar(c1);
            }
            System.out.println("-----------------------------------");
            turno++;
        }

        if (c1.estaViva()) {
            System.out.println("\n" + c1.getNombre() + " ha ganado la batalla!");
        } else {
            System.out.println("\n" + c2.getNombre() + " ha ganado la batalla!");
        }
    }
}