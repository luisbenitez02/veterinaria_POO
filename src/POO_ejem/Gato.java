package POO_ejem;

/**
 * Created by luisb on 12/06/2017.
 */
public class Gato extends Mascotas implements IDarCredito{

    private boolean eat_mouse;


    public Gato(int id, String name, String raza, char genero, boolean eat_mouse) {
        super(id, name, raza, genero);

        this.eat_mouse = eat_mouse;
    }

    @Override
    public String toString() {//NO SOBRESCRIBE, se anexa al que ya tenemos en mascota

        String dato;
        if (eat_mouse==true){
            dato="Evita que tu gato siga comiendo ratones";
        }else{
            dato="¡Buena dieta!";
        }
        return dato;
    }

    @Override
    public void darCredito() {
        System.out.println("Tu credito ha sido aprobado para el gatico");
    }
}
