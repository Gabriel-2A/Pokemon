public class Pokemon extends Personaje{

    //tipo - String
    //habilidad - Habilidad
    //HP - int
    //esLegendario - boolean
    //debilContra - String
    //fuerte contra - String
    //ataue - int

    private String tipo;
    private Habilidad habilidad;
    private int hp;
    private  boolean esLegendario;
    private String debilContra;
    private String fuerteContra;
    private int fuerza;
    private int velocidad;


    public String getDebilContra() {
        return debilContra;
    }

    public void setDebilContra(String debilContra) {
        this.debilContra = debilContra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isEsLegendario() {
        return esLegendario;
    }

    public void setEsLegendario(boolean esLegendario) {
        this.esLegendario = esLegendario;
    }

    public String getFuerteContra() {
        return fuerteContra;
    }

    public void setFuerteContra(String fuerteContra) {
        this.fuerteContra = fuerteContra;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Pokemon(String nombre, int nivel, char genero, String tipo, Habilidad habilidad, int hp,
                   boolean esLegendario, String debilContra, String fuerteContra, int fuerza, int velocidad) {
        super(nombre, nivel, genero);
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.hp = hp;
        this.esLegendario = esLegendario;
        this.debilContra = debilContra;
        this.fuerteContra = fuerteContra;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }

//pelea
    // consumi pocion o baya  para ataque?
        //habilidad.ataqueBase + 20

        //si mi pokemon es fuerte contra el pokemon opuesto
            //+ ataque de habilidad
        //sino si mi pokemon es debil contra el pokemon opuesto
            //- ataque de habilidad
        //sino
            //normal ataque

        //cuando se lanza el ataque se resta la vida
        // de ataque del hp


    @Override
    public boolean pelear(Pokemon pokemonContrario) {
        do {

            if(this.hp > pokemonContrario.getHp()){

            }

        }while ();

        return false;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", genero=" + genero +
                ", tipo='" + tipo + '\'' +
                ", habilidad=" + habilidad +
                ", hp=" + hp +
                ", esLegendario=" + esLegendario +
                ", debilContra='" + debilContra + '\'' +
                ", fuerteContra='" + fuerteContra + '\'' +
                ", fuerza=" + fuerza +
                ", velocidad=" + velocidad +
                '}';
    }
}
