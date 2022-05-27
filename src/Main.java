import java.util.ArrayList;
import java.util.Scanner;

public class Main implements UtilInterface{

    static ArrayList<Habilidad> habilidades = new ArrayList<>();
    static Habilidad habilidad = new Habilidad("Golpe hierro", "Lanza un poderoso ataque capaz de destruir rocas", 57);
    static Habilidad habilidad2 = new Habilidad("Vuelo", "Vuela muy alto para despues tirar un golpe fulminante", 78);
    static Habilidad habilidad3 = new Habilidad("Confusion", "Ataca directamente a la mente ", 65);
    static ArrayList<String> tiposPokemon;
    public static void main(String[] args){

            }

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFinal) {
        tiempoInicial = System.currentTimeMillis();
        Thread.sleep(2000);
        tiempoFinal = System.currentTimeMillis();
        double tiempo =(double) ((tiempoFinal - tiempoInicial)/1000);
        return tiempo;
    }

    @Override
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.-" +
                            "2.-" +
                            "3.-" +
                            "4.-");
        int decicion = sc.nextInt();
        switch (decicion){
            case
        }
    }

    @Override
    public Pokemon crearPokemonAleatorio() {
        return null;
    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
        return null;
    }

    @Override
    public String[] debilYFuerteAleatorio(String tipo) {
        switch (tipo){}
        return new String[0];
    }

    @Override
    public String[] nombresPokemonAleatorios(String tipo) {
        switch (tipo){}
        return new String[0];
    }
}
