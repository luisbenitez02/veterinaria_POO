package POO_ejem;

/**
 * Created by luisb on 12/06/2017.
 */
public class Principal {
    //aqui creo los objetos y ejecuto los metodos de las diferentes clases
    public static void main(String[] args) {
        Perro perro = new Perro(1, "Juanito", "Frespuder", 'M');
        Gato gato = new Gato(2, "Catya", "Egipcio", 'F', true);
        Tortuga paquita = new Tortuga(3, "Pquita", "Terracota", 'F', 12345857);

        SetJuego equipo = new SetJuego(4, "Gato equipo", 199900, "Variado", "16*16*60", 15, "Gatos");
        PelotaMorder pelotita = new PelotaMorder(1, "bola loca", 15000, "Azul", "60 diam");

        System.out.println(perro.toString());//ToString original de "mascotas"
        System.out.println(gato.toString());//ToString sobrescrito
        System.out.println(paquita.toString());

        System.out.println(equipo);//ToString sobrescrito (tambien se ejecuta sin especificarlo)
        System.out.println(pelotita.toString());//Original de "Juguetes"

        //metodos clase mascota
        perro.darCredito();//aplicado de la interface darcredito
        paquita.darDeAlta("Terracota","Paquita");
        equipo.devolucion(4,"Gato Equipo");

    }

}
