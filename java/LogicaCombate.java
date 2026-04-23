


public class LogicaCombate {

    public static void main(String[] args) {
        PersonajeBase p = new PersonajeBase();
        EnemigoBase e = new EnemigoBase();
        
        double vida = 25.0; 
        double vidaMax = 100.0;
        String estado;
        double pct = (vida / vidaMax) * 100;
        double bonificacion = 0.0;

        // Bonificacion por nivel

        if (p.nivel >= 5) {

            bonificacion = 10.0;

        } else {

            bonificacion = 0.0;
        }

        // Vida enemigo
        double vidaRestante = e.vida - (p.puntosAtaque + bonificacion);
        System.out.println("Vida restante del enemigo: " + vidaRestante);

        // Estado del personaje

        if (vidaRestante <= 0) {

            System.out.println("Enemigo derrotado! +50xp");

        } else if (vidaRestante <= 20) {

            System.out.println("Enemigo en estado critico!");

        } else {

            System.out.println("Enemigo resiste" + " con " + vidaRestante + " de vida.");
        }

        if (pct <= 0) {

            estado = "MUERTO";

        } else if (pct <= 25) {

            estado = "CRITICO";

        } else if (pct <= 50) {

            estado = "HERIDO";

        } else if (pct <= 75) {

            estado = "ESTABLE";

        } else {

            estado = "SALUDABLE";

        }

        System.out.println("Estado: " +

                estado);

        String clase = "Mago";
        int nivelHabilidad = 3;

        String tipoAtaque = switch (clase) {

            case "Guerrero" -> "Espada";

            case "Mago" -> "Hechizo";

            case "Arquero" -> "Flecha";

            default -> "Puño";
        };

        // Condicion compuesta
        boolean puedeUsarMagia = clase.equals("Mago") && nivelHabilidad >= 3;

        if (puedeUsarMagia) {

            System.out.println("Bola de fuego!");

        } else {
            System.out.println(tipoAtaque + " basico");
        }

    }
}
