package POO_ejem;

/**
 * Created by luisb on 12/06/2017.
 */
public class Mascotas {

    //atributos
    private int id;//private: solo accesible por esta clase
    private String name;
    private String color;
    private String raza;
    private byte edad;
    private char genero;

    public Mascotas(int id, String name, String raza, char genero) {
        this.id = id;
        this.name = name;
        this.raza = raza;
        this.genero = genero;
    }

    @Override
    public String toString() {
        String registro = "Tu " + name + " ["+ genero + "]" + " de raza " + raza + " ha sido registrado con #"+ id;

        return registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void darDeAlta(String raza, String name){
        System.out.println("Tu "+ raza + " " + name + "Ha sido dado de alta");
    }
}
