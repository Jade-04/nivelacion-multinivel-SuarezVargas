import java.util.Scanner;

public class PersonajeBase {

    // Atributos del personaje

    String nombre = "Gandalf";
    int nivel = 5;
    double vida = 80.0;
    double vidaMaxima = 100.0;
    double mana = 120.0;
    boolean estaVivo = true;
    String clase = "Mago";
    int puntosAtaque = 15;
    int puntosDefensa = 10;



    public static void main(String[] args) {

        PersonajeBase p = new

        PersonajeBase();

        System.out.println( p.nombre + " [" + p.clase + "] " + "Nv." + p.nivel + " | Vida: " + p.vida + " | Mana: " + p.mana);

        // Conversiones de tipo

        int ataque = 15;
        double dano = (double) ataque * 1.5;
        String msg = "Dano: " + dano;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nom = sc.nextLine();
        System.out.print("Nivel: ");
        int niv = sc.nextInt();
        System.out.println(nom + " Nv." + niv);

    }

}
