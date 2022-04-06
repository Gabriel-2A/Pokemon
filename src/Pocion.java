public class Pocion extends Objeto{

    //efecto - string
    //duracion - entero

    private String efecto;
    private int duracion;

    public Pocion(double costo, int cantidad, String nombre, String tipo, String efecto, int duracion) {
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


}
