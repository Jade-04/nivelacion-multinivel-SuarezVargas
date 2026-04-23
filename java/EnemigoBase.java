import java.util.Scanner;

public class EnemigoBase {

    // Atributos del personaje

    String nombre = "Sauro";
    int nivel = 5;
    double vida = 40.0;
    double vidaMaxima = 100.0;
    double mana = 120.0;
    boolean estaVivo = true;
    String clase = "Mago";
    int puntosAtaque = 35;
    int puntosDefensa = 10;

    public static void main(String[] args) {

        EnemigoBase e = new EnemigoBase();

        System.out.println(
                e.nombre + " [" + e.clase + "] " + "Nv." + e.nivel + " | Vida: " + e.vida + " | Mana: " + e.mana);

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
