public class Nodo {

    //Comppnenetes de un nodo
    private int dato;
    private Nodo izq;
    private Nodo der;

    //Constructor
    public Nodo(int dato){
        this.dato = dato;
    }

    public Nodo(){}

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
}
