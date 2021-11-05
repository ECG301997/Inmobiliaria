
package inmob;
import Modelo.Lista;
import Modelo.Propiedad;
import javax.swing.JOptionPane;

public class Main {
    

    public static void main(String[] args) {
        Lista l = new Lista();
        int op =0;
        do{
        op =Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el dato que desea: \n1.Agregar propiedad\n2.Mostrar\n6.Salir"));
       switch(op){
           case 1:
           
           String matricula,direccion,telefono,barrio,zona,descripcion;
           int precio;
           matricula = JOptionPane.showInputDialog(null,"ingrese la matricula");
           direccion = JOptionPane.showInputDialog(null,"ingrese la direccion");
           telefono = JOptionPane.showInputDialog(null,"ingrese el telefono");
           barrio = JOptionPane.showInputDialog(null,"ingrese el barrio");
           zona = JOptionPane.showInputDialog(null,"ingrese la zona");
           descripcion = JOptionPane.showInputDialog(null,"ingrese la descripcion");
           precio = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el precio"));
           l.insertar(new Propiedad(matricula,direccion,telefono,barrio,zona,descripcion,precio));
           break;
       case 2: {
            
           l.mostrar();
            break;
       }
       
       }
    }
       while(op!=6);
 }
}

