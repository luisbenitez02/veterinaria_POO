package POO_ejem;

/**
 * Created by luisb on 12/06/2017.
 */
public class Juguetes {
    private int id;
    private String nombre;
    private double precio;
    private String color;
    private String dimensiones;

    public Juguetes(int id, String nombre, double precio, String color, String dimensiones) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.dimensiones = dimensiones;
    }

    @Override
    public String toString() {
        String mensaje= "Se ha registrado la compra de " + nombre + " con ID: " + id +" y un valor de $ " + precio;
        return mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void devolucion(int id, String nombre){
        System.out.println("Tu "+ nombre + "con ID: " + id + "esta en proceso de devolucion");
    }
}
