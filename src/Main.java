import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class Main implements UtilInterface{

    static ArrayList<Habilidad> habilidades = new ArrayList<>();
    static Habilidad habilidad = new Habilidad("Golpe hierro", "Lanza un poderoso ataque capaz de destruir rocas", 57);
    static Habilidad habilidad2 = new Habilidad("Vuelo", "Vuela muy alto para despues tirar un golpe fulminante", 78);
    static Habilidad habilidad3 = new Habilidad("Confusion", "Ataca directamente a la mente ", 65);
    static ArrayList<String> tiposPokemon;

    public static void main(String[] args) throws InterruptedException {

        long tiempoInicial = System.currentTimeMillis();

        habilidades.add(habilidad);
        habilidades.add(habilidad2);
        habilidades.add(habilidad3);

        tiposPokemon = new ArrayList<>(Arrays.asList("Agua", "Tierra", "Fuego", "Planta"));
        Main main = new Main();

        //while respusta == 0
        // mostrar menu
        // usuario escoge
        // explorar
        //  while para saber si uiere dejar de observar

        int respuesta = 1;
        Scanner scanner = new Scanner(System.in);
        while (respuesta != 0)
                main.mostrarMenu();
        System.out.println("Elija una opcion: ");
                respuesta = scanner.nextInt();
                if(respuesta == 1){
                    int dejarExlorar = 1;
                    while (dejarExlorar != 0){
                        Thread.sleep(1000);
                        System.out.println("Aparecio un pokemon salvaje");
                        System.out.println(main.crearPokemonAleatorio());
                        System.out.println("Quieres seguir explorando 1.");
                        dejarExlorar = scanner.nextInt();
                    }
                }
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
                            "\n0.- terminar");
    }

    @Override
    public Pokemon crearPokemonAleatorio() {
        Random random = new Random();
        String tipo = sacarAleatorio(tiposPokemon);
        int tamanioNombre = nombresPokemon(tipo).length;
        int nombre = random.nextInt(tamanioNombre);
        int hp = random.nextInt(200);
        int nivel = random.nextInt(100);
        boolean legendario = random.nextBoolean();/*random.nextInt(500) == 1 ? true : false;*/
        String[] debilFuerte = debilYFuerte(tipo);
        int fuerza = random.nextInt(200);
        int velocidad = random.nextInt(200);
        char genero = random.nextInt(10) < 5 ? 'f' : 'm';
        return new Pokemon(nombresPokemon(tipo)[nombre], nivel,
                genero, tipo, sacarAleatorio(habilidades), hp,
                legendario, debilFuerte[0], debilFuerte[1], fuerza, velocidad);
    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
        Random random = new Random();
        int indice = random.nextInt(arrayList.size());
        return arrayList.get(indice);
    }

    @Override
    public String[] debilYFuerte(String tipo) {
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
    public String[] nombresPokemon(String tipo) {
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
