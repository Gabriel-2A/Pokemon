import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main implements UtilInterface{

    static ArrayList<Habilidad> habilidades = new ArrayList<>();
    static Habilidad habilidad = new Habilidad("Golpe hierro", "Lanza un poderoso ataque capaz de destruir rocas", 57);
    static Habilidad habilidad2 = new Habilidad("Vuelo", "Vuela muy alto para despues tirar un golpe fulminante", 78);
    static Habilidad habilidad3 = new Habilidad("Confusion", "Ataca directamente a la mente ", 65);
    static ArrayList<String> tiposPokemon;

    public static void main(String[] args){

                long tiempoInicial = System.currentTimeMillis();

                habilidades.add(habilidad);
                habilidades.add(habilidad2);
                habilidades.add(habilidad3);

                tiposPokemon = new ArrayList<>(Arrays.asList("Agua", "Tierra", "Fuego", "Planta"));
            }

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFinal) {
      //  tiempoInicial = System.currentTimeMillis();
        //Thread.sleep(2000);
      //  tiempoFinal = System.currentTimeMillis();
        double tiempo =(double) ((tiempoFinal - tiempoInicial)/1000);
        System.out.println("Tiempo jugado: " + tiempo);
        //return tiempo;
    }

    @Override
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.- explorar" +
                            "\n2.- entrar a  la tienda" +
                            "\n3.- ver estaisticas" +
                            "\n4.- tiempo jugador" +
                            "\n5.- terminar");
    }

    @Override
    public Pokemon crearPokemonAleatorio() {
        Random random = new Random();
        int numeroTipo = random.nextInt(tiposPokemon.size());
        String tipo = tiposPokemon.get(numeroTipo);
        int tamanioNombre = nombresPokemonAleatorios(tipo).length;
        int nombre = random.nextInt(tamanioNombre);
        int hp = random.nextInt(200);
        boolean legendario = random.nextBoolean();/*random.nextInt(500) == 1 ? true : false;*/
        String[] debilFuerte = debilYFuerteAleatorio(tipo);
        int fuerza = random.nextInt(200);
        int velocidad = random.nextInt(200);
        int numHabilidad = random.nextInt(habilidades.size());
        return null;
    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
        Random random = new Random();
        int indice = random.nextInt(arrayList.size());
        return arrayList.get(indice);
    }

    @Override
    public String[] debilYFuerteAleatorio(String tipo) {
        String[] debilYFuerte = new String[2];
        switch (tipo){
            case "Agua":
                debilYFuerte[0] = "Planta";
                debilYFuerte[1] = "Tierra";
                break;
            case "Tierra":
                debilYFuerte[0] = "Agua";
                debilYFuerte[1] = "Fuego";
                break;
            case "Fuego":
                debilYFuerte[0] = "Tierra";
                debilYFuerte[1] = "Planta";
                break;
            case "Planta":
                debilYFuerte[0] = "Fuego";
                debilYFuerte[1] = "Agua";
                break;
        }
        return debilYFuerte;
    }

    @Override
    public String[] nombresPokemonAleatorios(String tipo) {
        String[] nombres = new String[4];
        switch (tipo){
            case "Agua":
                nombres[0] = "Squirtle";
                nombres[1] = "Magicarp";
                nombres[2] = "Mudkip";
                nombres[3] = "Tentacool";
                break;

            case "Tierra":
                nombres[0] = "Onix";
                nombres[1] = "Agroon";
                nombres[2] = "Geodude";
                nombres[3] = "Flygon";
                break;

            case "Fuego":
                nombres[0] = "Charizard";
                nombres[1] = "Slamander";
                nombres[2] = "Chameroth";
                nombres[3] = "Kombuzken";
                break;

            case "Planta":
                nombres[0] = "Bulbasaur";
                nombres[1] = "Brelooom";
                nombres[2] = "Gardevoir";
                nombres[3] = "Treko";
                break;
        }
        return nombres;
    }
}
