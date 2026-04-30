
public class LogicaCombate {

    public static void main(String[] args) {
        PersonajeBase p = new PersonajeBase();
        EnemigosBase e = new EnemigosBase();
        FuncionesRPG f = new FuncionesRPG();

        do {
            int i = FuncionesRPG.calcularDano(p.Ataque, e.Defensa[0]);
            System.out.println("Dano infligido: " + i);
            e.vida[0] -= i;
            System.out.println("Vida del enemigo: " + e.vida[0]);
            int j = FuncionesRPG.calcularDano(e.Ataque[0], p.Defensa);
            System.out.println("Dano recibido: " + j);
            p.vida -= j;
            System.out.println("Vida del personaje: " + p.vida);
            if (e.vida[0] < 0) {
                e.vida[0] = 0;
            }
            if (p.vida <= 0) {
                System.out.println("Nos mormimos chamo");

            } else if (e.vida[0] <= 0) {
                System.out.println("El " + e.nombre[0] + " ha sido derrotado!");
                int cura = 20;
                p.vida = FuncionesRPG.aplicarCuracion(p.vida, cura, p.vidaMaxima);
                System.out.println("Vida del personaje: " + p.vida);

            }
            int k = FuncionesRPG.calcularDano(p.Ataque, e.Defensa[1]);
            System.out.println("Dano infligido: " + k);
            e.vida[1] -= k;
            System.out.println("Vida del enemigo: " + e.vida[1]);
            int l = FuncionesRPG.calcularDano(e.Ataque[1], p.Defensa);
            System.out.println("Dano recibido: " + l);
            p.vida -= l;
            System.out.println("Vida del personaje: " + p.vida);
            if (e.vida[1] < 0) {
                e.vida[1] = 0;
            }
            if (p.vida <= 0) {
                System.out.println("Nos mormimos chamo");

            } else if (e.vida[1] <= 0) {
                System.out.println("El " + e.nombre[1] + " ha sido derrotado!");
                int cura = 20;
                p.vida = FuncionesRPG.aplicarCuracion(p.vida, cura, p.vidaMaxima);
                System.out.println("Vida del personaje: " + p.vida);

            }

        } while (e.vida[1] > 0 && p.vida > 0);

        do {
            int o = FuncionesRPG.calcularDano(p.Ataque, e.Defensa[2]);
            System.out.println("Dano infligido: " + o);
            e.vida[2] -= o;
            System.out.println("Vida del enemigo: " + e.vida[2]);
            int m = FuncionesRPG.calcularDano(e.Ataque[2], p.Defensa);
            System.out.println("Dano recibido: " + m);
            p.vida -= m;
            System.out.println("Vida del personaje: " + p.vida);
            if (e.vida[2] < 0) {
                e.vida[2] = 0;
            }
            if (p.vida <= 0) {
                System.out.println("Nos mormimos chamo");

            } else if (e.vida[2] <= 0) {
                System.out.println("El " + e.nombre[2] + " ha sido derrotado!");
                int cura = 20;
                p.vida = FuncionesRPG.aplicarCuracion(p.vida, cura, p.vidaMaxima);
                System.out.println("Vida del personaje: " + p.vida);

            }
        } while (e.vida [2] > 0 && p.vida > 0);

    }
}
