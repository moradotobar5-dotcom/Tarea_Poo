/*Cree la clase llamada pokemon */
public class Pokemon {
/* Asigne atributos  */
    private String nombre;
    private String tipo;
    int salud;
/*Es el constructor con los atributos que llevara cada objeto */
    public Pokemon(String nombre, String tipo, int salud){
        this.nombre = nombre;
        this.tipo = tipo;
        this.salud = salud;
    }
/*Es la funcion que cree para presentar al objeto */
    public void presentarse(){
        System.out.println("Tu Primer Pokmeon es " + this.nombre +  " Tipo " +this.tipo+  " con " + this.salud + " de vida");
    }
    /*Muestra el mensaje en pantalla y llama al objeto */
    public static void main(String[] args) {
        Pokemon charizard = new Pokemon("Charizard","Fuego", 200);
        System.out.println("Hola entrenador, has elegido a tu primer pokemon");
        charizard.presentarse();
    }
}