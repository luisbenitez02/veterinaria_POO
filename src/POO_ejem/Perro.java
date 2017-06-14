package POO_ejem;

/**
 * Created by luisb on 12/06/2017.
 * Hereda de Mascota
 */
public class Perro extends Mascotas implements IDarCredito{

    public Perro(int id, String name, String raza, char genero) {
        super(id, name, raza, genero);
    }

    @Override
    public void darCredito() {
        System.out.println("Tu credito ha sido aprobado para el perrito");
    }
}
