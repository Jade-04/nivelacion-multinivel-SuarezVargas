public class FuncionesRPG {
    
    // Retorna el dano real (min 1)

    public static int calcularDano(int ataque, int defensa) {

        int dano = ataque - defensa ;
        return dano > 0 ? dano : 1;

    }

    // Cura sin pasar del maximo

    public static int aplicarCuracion(int vida, int cur, int max) {

        int nueva = vida + cur;

        return nueva > max ? max : nueva;

    }

    // Sin retorno: solo imprime

    public static void mostrarEstado(String n, double vida, int niv) {

        System.out.printf("%s [Nv%d] HP: %.0f%n", n, niv, vida);

    }

    public static void subirNivel(int xp_necesaria, int xp_actual, int nivel) {
        if (xp_actual >= xp_necesaria) {

            nivel++;

            xp_actual -= xp_necesaria;

        } else {

            System.out.println("Sigue luchando!");

        }
        System.out.println("Nivel " + nivel);
        System.out.println("XP: " + xp_actual);
    }

    public static void main(String[] args)

    {

        int d = calcularDano(20, 8);

        System.out.println("Dano: " + d);

        double v = aplicarCuracion(40, 80,

                100);

        mostrarEstado("Frodo", v, 3);

        subirNivel(100, 120, 4);

    }

}