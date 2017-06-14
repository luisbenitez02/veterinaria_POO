package POO_ejem;

/**
 * Created by luisb on 12/06/2017.
 */
public class SetJuego extends Juguetes implements IDarCredito{


    private int num_piezas;
    private String tipo_uso;

    public SetJuego(int id, String nombre, double precio, String color, String dimensiones, int num_piezas, String tipo_uso) {
        super(id, nombre, precio, color, dimensiones);

        this.num_piezas =num_piezas;
        this.tipo_uso = tipo_uso;
    }

    @Override
    public String toString() {
       String dato="Cuida las " + num_piezas + " piezas, estas no tienen devolucion" + "recuerda"+
               " esta recomendada para: " + tipo_uso;
       return dato;
    }

    @Override
    public void darCredito() {
        System.out.println("Tu credito ha sido aprobado para el Set de juego");
    }
}
