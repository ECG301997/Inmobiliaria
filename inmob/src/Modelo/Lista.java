package Modelo;
import javax.swing.JOptionPane;
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacia(){
        if (inicio == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertar(Propiedad contiene){
        Nodo actual;
        if(estaVacia()){//si esta vacia, va a entrar
            actual = new Nodo(contiene,null);
            inicio= actual;
            fin = actual;
        }else{
            actual = new Nodo(contiene,null);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    
    public void mostrar(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
            return;
        }else{
            Nodo temporal;
            temporal = inicio;
            while(temporal !=null){
                JOptionPane.showMessageDialog(null, temporal.getContiene());
                temporal = temporal.getSiguiente();
            }
        }
    }
}
