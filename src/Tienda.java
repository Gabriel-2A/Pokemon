import java.util.ArrayList;

public class Tienda {

    //Atributos
    //nombre - String
    //objetos disponibles - ArrayList<Objetos>
    private String nombre;
    private ArrayList<Objeto> objetosDisponibles = new ArrayList<>();

    public Tienda(String nombre, ArrayList<Objeto> objetosDisponibles) {
        this.nombre = nombre;
        this.objetosDisponibles = objetosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Objeto> getObjetosDisponibles() {
        return objetosDisponibles;
    }

    public void setObjetosDisponibles(ArrayList<Objeto> objetosDisponibles) {
        this.objetosDisponibles = objetosDisponibles;
    }

    //metodos
    //comprar
    public boolean usuarioComprar(double dinero, int cantidad, int indiceObjeto){
            // Todo validar que hay suficientes objetos del tipo requerido(?)
            //Si hay cantidad y existe en el arreglo
                //Si si tengo dinero suficiente
                    //le vendo
                //Si no
                    //Mostrar que no le alcanza
            //Sino
                //hacer una excepcion de que no hay la cantidad que pide
                //repetimos pregunta
        if(indiceObjeto > objetosDisponibles.size()) {
            System.out.println("Error");
            return false;
        } else {
            if (objetosDisponibles.get(indiceObjeto).cantidad >= cantidad) {
                double presioTotal = cantidad * objetosDisponibles.get(indiceObjeto).costo;
                if(dinero >= presioTotal){
                    System.out.println("Usted esta comprando " + cantidad + " " + objetosDisponibles.get(indiceObjeto).nombre + " por $" + presioTotal);
                    System.out.println("Su cambio es: " + (dinero-presioTotal));
                    return true;
                } else {
                    System.out.println("No le alcanza, le falta: " + (presioTotal - dinero));
                    return  false;
                }
            } else {
                System.out.println("No tenemos la cantidad solicitada");
                return false;
            }
        }
    }

    //vender
    public boolean usuarioVender(Objeto objeto, int cantidad){

        if(objeto.getClass().toString().equals("class Baya")){
            System.out.println("No acepto bayas");
            return false;
        } else {
            for (Objeto elemento : objetosDisponibles){
                if(elemento.nombre.equals(objeto.nombre)){
                    elemento.cantidad += cantidad;
                    System.out.println("Comprado Objeto existente");
                    return true;
                }
            }
            objetosDisponibles.add(objeto);
            objetosDisponibles.get(objetosDisponibles.size()-1).cantidad = cantidad;
            System.out.println("Comprado Objeto existente");
            return  true;
        }
        //logica inversa de comprar

        //dinero infinito en la tienda
        //recibir objetos y darle el diner0
    }

    public void mostrarDisponibles(){
        System.out.println("los objetos disponibles son: ");
        int indice = 1;
        for (Objeto objeto:objetosDisponibles) {
            System.out.println(indice+"");
            System.out.println(objeto); // falta implementar to string
        }
    }

}
