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
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
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



    //ganar metodo -> el entrenador opuesto ya no tienepokemones
        //nivel 1 = 10 xp pokemon y entrenador
        //nivel n = 10 xp * 1.5 pokemon y entrenador
    //perder metodo -> yo me quedo sin pokemones

    //tirar objeto
        //mostrar los elementos de mochila
        //que el usuario escoja cual tirar


    @Override
    public boolean pelear(Pokemon pokemonContrario) {
        //escoger pokemones para pelear
        ArrayList<Pokemon> paraPelear = new ArrayList<>();
        mostrarPokedex(pokedex);
        System.out.println("escoge 3 pokemones");
        for (int i = 0; i < 3; i++) {
            paraPelear.add(pokedex.get(sc.nextInt()-1));
        }
        int respuesta;

        do {
            System.out.println("1.- Pelear");
            System.out.println("2.- Usar pocion");
            System.out.println("3.- Huir");
            respuesta = sc.nextInt();
            if(paraPelear.size() != 0) {
                if (respuesta == 1) {
                    System.out.println("escoge el pokemon para pelear");
                    mostrarPokedex(paraPelear);
                    int eleccion = sc.nextInt();
                    if(!paraPelear.get(eleccion).pelear(pokemonContrario)){
                        paraPelear.remove(eleccion);
                        return false;
                    } else {
                        return true;
                    }
                } else if (respuesta == 2) {
                    mostrarMochila();
                    System.out.println("Escoge la pocion");
                    int eleccionn = sc.nextInt();

                    System.out.println("escoge el pokemon para dar Pocion");
                    mostrarPokedex(paraPelear);
                    int elecccion = sc.nextInt();
                    mochila.get(elecccion - 1).usar(paraPelear.get(sc.nextInt() - 1));
                    return true;
                } else if (respuesta == 3) {
                    return false;
                }
            }
        }while (respuesta != 0);
        return false;
    }

    public boolean tirarObjeto(int indiceObjeto){
        if(indiceObjeto > mochila.size()-1){
            return false;
        } else {
            mochila.remove(indiceObjeto);
            return true;
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



    public boolean intercambiarPokemon(ArrayList<Pokemon> pokedexOpuesto){

        System.out.println("Pokemones disponibles del entrenador Opuesto: ");
        int indice = 1;
        for (Pokemon pokemon: pokedexOpuesto) {
            System.out.println(indice+" . ");
            System.out.println(pokemon);
            indice++;
        }

        System.out.println("¿Que pokemon deceas intercambiar?");
        int indicePokemonOpuesto = sc.nextInt()-1;
        System.out.println("Que pokemon ofreses?");
        mostrarPokedex(pokedex);
        int indicePokemonPropio = sc.nextInt()-1;
        System.out.println("Te lo cambio por: " + pokedex.get(indicePokemonPropio));

        boolean probabilidad = ((random.nextInt(100)) > 60) ? true : false;
        if(probabilidad){
            Pokemon aux = pokedex.get(indicePokemonPropio);
            pokedex.set(indicePokemonPropio, pokedexOpuesto.get(indicePokemonOpuesto));
            pokedexOpuesto.remove(indicePokemonOpuesto);
            pokedexOpuesto.add(aux);
            return true;
        } else {
            System.out.println("El otro entrenador no accedio a intercambiar su pokemon");
            return false;
        }
    }

    public void mostrarMochila(){
        System.out.println("los objetos disponibles son: ");
        int indice = 1;
        for (Objeto objeto : mochila) {
            System.out.println(indice+" . ");
            System.out.println(objeto);
            indice++;
        }
    }

    public void mostrarPokedex(ArrayList<Pokemon> pokemones){
        System.out.println("los Pokemones disponibles son: ");
        int indice = 1;
        for (Pokemon pokemon : pokedex) {
            System.out.println(indice+" . ");
            System.out.println(pokemon);
            indice++;
        }
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "region='" + region + '\'' +
                ", torneosganados=" + torneosganados +
                ", pokedex=" + pokedex +
                ", mochila=" + mochila +
                ", dinero=" + dinero +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", genero=" + genero +
                '}';
    }
}
