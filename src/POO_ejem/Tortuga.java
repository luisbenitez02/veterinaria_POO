package POO_ejem;

/**
 * Created by luisb on 12/06/2017.
 */
public class Tortuga extends Mascotas{

    private int serial_dagma;


    @Override
    public String toString() {
        String dato = "Los animales salvajes requieren cuidados mas complejos";
        return dato;
    }

    public Tortuga(int id, String name, String raza, char genero, int serial_dagma) {
        super(id, name, raza, genero);

        this.serial_dagma = serial_dagma;


    }
}
