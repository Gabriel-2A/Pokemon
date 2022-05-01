import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Entrenador extends Personaje{

    //region - String
    //torneosGanados - int
    //pokedex - Arraylist<Pokemon>
    //mochila - ArrayList<Objeto>

    private String region;
    private int torneosganados;
    private ArrayList<Pokemon> pokedex = new ArrayList<>();
    private ArrayList<Objeto> mochila = new ArrayList<>();
    private double dinero;

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getTorneosganados() {
        return torneosganados;
    }

    public void setTorneosganados(int torneosganados) {
        this.torneosganados = torneosganados;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    public ArrayList<Objeto> getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList<Objeto> mochila) {
        this.mochila = mochila;
    }

    public Entrenador(String nombre, int nivel, char genero, String region,
                      int torneosganados, ArrayList<Pokemon> pokedex,
                      ArrayList<Objeto> mochila, double dinero) {
        super(nombre, nivel, genero);
        this.region = region;
        this.torneosganados = torneosganados;
        this.pokedex = pokedex;
        this.mochila = mochila;
        this.dinero = dinero;
    }

    //pelear - Abstracto implementado
        //escoger pokemon del pokedex

            //si su HP es superior a 15
                //escoger 2 fuertes y 1 debil aleatorios
            //si no tiene fuertes, poner 3 aleaatorios
        //arreglo de pokemones a usar en la pelea


        //darle a escoger el pokemon al entrenador
        //mostrar estadisticas del pokemon
            //menu para pelear, curar, aumentar ataque o velocidad
        //si escoge pelear
            //llamar al metodo pelear del pokemon
        //si escoge curar
            //hay que validar si hay pocion/baya de curacion, usar
        //si escoge +ataque
            //hay que validar si hay pocion/baya de +ataque, usar
        //si escoge velocidad
            //hay que validar si hay pocion/baya de +velocidad, usar

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    //ganar metodo -> el entrenador opuesto ya no tienepokemones
        //nivel 1 = 10 xp pokemon y entrenador
        //nivel n = 10 xp * 1.5 pokemon y entrenador
    //perder metodo -> yo me quedo sin pokemones

    //tirar objeto
        //mostrar los elementos de mochila
        //que el usuario escoja cual tirar

    public void tirarObjeto(int indiceObjeto){
        System.out.println("Objetos disponibles: ");
        for (Objeto objeto: mochila) {
            System.out.println(mochila);
        }
        System.out.println("Digite el numero del objeto que decea tirar: ");
        indiceObjeto = sc.nextInt();
        if(mochila.size() <= 0){
            System.out.println("Ya no hay objetos para tirar");
        } else {
            mochila.remove(indiceObjeto);
        }
    }

    //intercambiar
        //mostrar la pokedex
        //mostrar la pokedex del entrenador opuesto
        //escogo el pokemon que quiero
        // le propongo un de mi pokedex
        //y con random true o false acepta
        //si true
            //get y add + remove



    public void intercambiarPokemon(int indicePokemonPropio, int indicePokemonAjeno, boolean probabilidad){

        System.out.println("Pokemones disponibles del entrenador " + nombre + ": ");
        for (Pokemon pokemon: pokedex) {
            System.out.println(pokedex);
        }

        System.out.println("Pokemones disponibles del entrenador " + nombre + ": ");
        for (Pokemon pokemon: pokedex) {
            System.out.println(pokedex);
        } //No se me ocurre como mostrar la pokedex del otro entrenador

        System.out.println("¿Que pokemon deceas intercambiar?");
        indicePokemonAjeno = sc.nextInt();
        System.out.println("Que pokemon ofreses?");
        indicePokemonPropio = sc.nextInt();

        probabilidad = random.nextInt(100) > 60;
        if(probabilidad){

        } else {
            System.out.println("El otro entrenador no accedio a intercambiar su pokemon");
        }
    }

}
