import java.util.Scanner;

public class PersonajeBase {

    // Atributos del personaje

    String nombre = "Gandalf";
    int nivel = 2;
    int vida = 80;
    int vidaMaxima = 80;
    double mana = 120.0;
    boolean estaVivo = true;
    String clase = "Guerrero";
    int Ataque = 18;
    int Defensa = 4;

    public static void main(String[] args) {

        PersonajeBase p = new PersonajeBase();

        System.out.println(
                p.nombre + " [" + p.clase + "] " + "Nv." + p.nivel + " | Vida: " + p.vida + " | Mana: " + p.mana);

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
