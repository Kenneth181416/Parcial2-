
package parcial2;

class Mago extends Criatura {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dano = fuerza;
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        objetivo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        salud -= dano;
        System.out.println(nombre + " recibe el hechizo. Salud restante: " + salud);
    }
}