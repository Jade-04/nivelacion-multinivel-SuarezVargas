import java.util.Scanner;

public class EnemigosBase {
        
    // Atributos del personaje

    String [] nombre = {"Goblin","Orco", "Dragon "};
    int [] vida = {40, 70, 120};
    int [] Ataque = {8, 14, 25};
    int [] Defensa = {0, 0, 0};
    

    public static void main(String[] args) {

        EnemigosBase e = new EnemigosBase();



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
