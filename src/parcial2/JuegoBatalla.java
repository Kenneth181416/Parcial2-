
package parcial2;

public class JuegoBatalla {
    public static void main(String[] args) {
        Criatura dragon = new Dragon("Draco", 120, 30);
        Criatura mago = new Mago("Merlín", 100, 25);
        Criatura guerrero = new Guerrero("Arthur", 110, 28);

        Batalla.simular(dragon, mago);
        Batalla.simular(guerrero, dragon);
        Batalla.simular(mago, guerrero);
    }
}
