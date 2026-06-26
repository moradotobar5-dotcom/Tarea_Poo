public class Pokemon {

    String nombre;
    String tipo;
    int salud;

    public Pokemon(String nombre, String tipo, int salud){
        this.nombre = nombre;
        this.tipo = tipo;
        this.salud = salud;
    }

    public void presentarse(){
        System.out.println("Tu Primer Pokmeon es " + this.nombre +  " Tipo " +this.tipo+  " con " + this.salud + " de vida");
    }
    public static void main(String[] args) {
        Pokemon charizard = new Pokemon("Charizard","Fuego", 200);
        System.out.println("Hola entrenador, has elegido a tu primer pokemon");
        charizard.presentarse();
    }
}