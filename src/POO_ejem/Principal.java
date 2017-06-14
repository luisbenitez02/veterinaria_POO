package POO_ejem;

import java.util.ArrayList;
import java.util.Vector;

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

        //vamos a crear un arraylist
        ArrayList<String> servicios = new ArrayList<String>();
        servicios.add("Inyectologia");
        servicios.add("Peluqueria");
        servicios.add("Baño");
        servicios.add("Desparacitacion");
        servicios.add("Castracion");

        System.out.println("Lista de servicios: "  + servicios + ", con un total de " + servicios.size());

        servicios.remove(3);//removemos el indice 3 "Desparacitacion"

        System.out.println("Se ha removido un servicio..................");
        System.out.println("Lista de servicios: "  + servicios + ", con un total de " + servicios.size());


        //creamos un vector
        Vector<String> promociones = new Vector<String>();

        promociones.addElement("Dia perruno");
        promociones.addElement("Gatutodo");
        promociones.addElement("10% Descuento disfraz de perro");
        promociones.addElement("Jornada de vacunacion");
        promociones.addElement("Serpiente-Promo");

        System.out.println("Lista de promos: " + promociones);
        System.out.println("Total de promos: " + promociones.size());

        promociones.remove(4);//removemos 4 "Serpiente-Promo"
        System.out.println("Se ha removido una promocion..................");

        System.out.println("Lista de promos: " + promociones);
        System.out.println("Total de promos: " + promociones.size());

        String[] dias_Semana = {"Lunes","Martes","Miercoles","Jueves","Viernes", "Sabado","Domingo"};

        try{
            System.out.println("Elemento 6 de servicios: " + dias_Semana[8]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ey te pasaste del indice, solo hay 5 elementos");
        } catch (Exception e){
            System.out.println("Algo paso, el problema es que no se que...");
            System.out.println("La siguiente linea ayudara a ver el error");
            e.printStackTrace();//solo para desarrolladores
        }finally {
            System.out.println("------------------------El curso termino! Pero sigue el de Intro a Android!!!!--------------------------");
        }

    }

}
