public class Baya extends Objeto{

    //efecto - string
    //duracion - entero

    private String efecto;
    private int duracion;

    public Baya(double costo, int cantidad, String nombre, String tipo, String efecto, int duracion) {
        super(costo, cantidad, nombre, tipo);
        this.efecto = efecto;
        this.duracion = duracion;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //usar
        //si es curacion
          //aumentar 20 hp
        //si es de fuerza
            //aumentar 20 de ataque
        //si es velocidad
            //aumentar 20 de velocidad


    @Override
    public boolean usar(Pokemon pokemon) {
        if(this.efecto.equals("curacion")){
            pokemon.setHp(pokemon.getHp()+20);
            return true;
        } else if(this.efecto.equals("fuerza")){
            pokemon.setFuerza(pokemon.getFuerza()+20);
            return true;
        } else if(this.efecto.equals("velocidad")){
            pokemon.setVelocidad(pokemon.getVelocidad()+20);
            return true;
        } else {
            return false;
        }
    }
}
