package Modelo;

//creamos una clase nodo
public class Nodo {
    private Nodo siguiente;
    private Object contiene;

    public Nodo(Object contiene,Nodo siguiente) {
        this.siguiente = siguiente;
        this.contiene = contiene;
    }



    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Object getContiene() {
        return contiene;
    }

    public void setContiene(Object contiene) {
        this.contiene = contiene;
    }
    
    
}
