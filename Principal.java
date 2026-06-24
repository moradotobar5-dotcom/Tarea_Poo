public class Principal {

      /*Aqui arranca el programa e imprime los datos de cada objeto y sua atributos */
    public static void main(String[] args) {
        TipoFuego charizard = new TipoFuego("Charizard", "Fuego", 95);
        /*imprime cada datos del pokemon, como nombre tipo y daño */
        System.out.println("Nombre: " + charizard.getNombre());
        System.out.println("Tipo: " + charizard.tipo_Pokemon);
        System.out.println("Potencia Lanzallamas: " + charizard.lanzallamas);
    }
}
/*Aqui cree la clase pokemon con los atributos que lleva */
class Pokemon {
    private String nombre;
    public String tipo_Pokemon;

    public Pokemon(String nombre, String tipo_Pokemon) {
        this.nombre = nombre;
        this.tipo_Pokemon = tipo_Pokemon;
    }

    public String getNombre() {
        return this.nombre;
    }
}
/*Esta clase toma atributos de la clase pokemon y agregue un atributo nuevo */
class TipoFuego extends Pokemon {
    public int lanzallamas;
/*Aqui se le asignas los atributos */
    public TipoFuego(String nombre, String tipo_Pokemon, int lanzallamas) {
        super(nombre, tipo_Pokemon);
        this.lanzallamas = lanzallamas;
    }
}