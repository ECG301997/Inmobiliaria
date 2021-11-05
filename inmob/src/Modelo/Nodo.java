package Modelo;

//creamos una clase nodo
public class Nodo {
    private Nodo siguiente;
    private Propiedad contiene;


    public Nodo() {
    }

    public Nodo(Nodo siguiente, Propiedad contiene) {
        this.siguiente = siguiente;
        this.contiene = contiene;
    }

    Nodo(Propiedad contiene, Object object) {
       
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Propiedad getContiene() {
        return contiene;
    }

    public void setContiene(Propiedad contiene) {
        this.contiene = contiene;
    }
    
    
}
