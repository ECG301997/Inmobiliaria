
package inmob;
import Modelo.Cliente;
import Modelo.Lista;
import Modelo.Propiedad;
import javax.swing.JOptionPane;

public class Main {
    

    public static void main(String[] args) {
        Lista propiedad = new Lista();
        Lista cliente = new Lista();
        Lista propietario = new Lista();
        String nombre,profesion,trabajo,desc_propiedad,matricula , direccion , telefono , barrio , zona , descripcion;
        int precio,salario,eleccion;
        int op =0;
        do{
        op =Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la opción que desea:\n1.Clientes arrendatarios.\n2.Clientes Propietarios."
                + "\n3.Propiedades.\n4.Actualizar datos de clientes y domicilios.\n5.Filtrar propiedades por valor.\n6.Filtrar por zona y valor."
                + "\n7.Mostrar direccion de propiedades disponibles.\n8.Registrar una propiedad alquilada.\n9.Salir"));
       switch(op){
           
            case 1:
                eleccion = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la opción que desea:\n1.Registrar Arrendatario\n2.Ver arrendatarios"));
                if(eleccion ==1){
                    
               nombre = JOptionPane.showInputDialog(null,"ingrese su nombre");
               telefono = JOptionPane.showInputDialog(null,"ingrese su telefono");
               direccion = JOptionPane.showInputDialog(null,"ingrese su direccion");
               trabajo = JOptionPane.showInputDialog(null,"ingrese su lugar de trabajo");
               profesion = JOptionPane.showInputDialog(null,"ingrese su profesión");
               desc_propiedad = JOptionPane.showInputDialog(null,"ingrese la descripción de la propiedad");
               salario = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese su salario"));
               cliente.insertar(new Cliente(nombre,telefono,direccion,profesion,trabajo,desc_propiedad,salario));
                }else if (eleccion == 2){
                    cliente.mostrar();
                }else{
                    JOptionPane.showMessageDialog(null,"elección errada");
                }
                break;
            case 2:
                eleccion = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la opción que desea:\n1.Registrar Propietario\n2.Ver Propietarios"));
                if(eleccion ==1){
                    nombre = JOptionPane.showInputDialog(null,"ingrese su nombre");
                    telefono = JOptionPane.showInputDialog(null,"ingrese su telefono");
                    direccion = JOptionPane.showInputDialog(null,"ingrese su direccion");
                    trabajo = JOptionPane.showInputDialog(null,"ingrese su lugar de trabajo");
                    profesion = JOptionPane.showInputDialog(null,"ingrese su profesión");
                    desc_propiedad = JOptionPane.showInputDialog(null,"ingrese la descripción de la propiedad");
                    salario = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese su salario"));
                    propietario.insertar(new Cliente(nombre,telefono,direccion,profesion,trabajo,desc_propiedad,salario));
                }else if (eleccion == 2){
                    propietario.mostrar();
                 }else{
                    JOptionPane.showMessageDialog(null,"Elección errada");
                }   
                break;    
            case 3:
                eleccion = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la opción que desea:\n1.Registrar Propiedad\n2.Ver Propiedades"));
                if(eleccion ==1){
                    matricula = JOptionPane.showInputDialog(null,"ingrese la matricula");
                    direccion = JOptionPane.showInputDialog(null,"ingrese la direccion");
                    telefono = JOptionPane.showInputDialog(null,"ingrese el telefono");
                    barrio = JOptionPane.showInputDialog(null,"ingrese el barrio");
                    zona = JOptionPane.showInputDialog(null,"ingrese la zona");
                    descripcion = JOptionPane.showInputDialog(null,"ingrese la descripcion");
                    precio = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el precio"));
                    propiedad.insertar(new Propiedad(matricula,direccion,telefono,barrio,zona,descripcion,precio));
                }else if (eleccion == 2){
                    propiedad.mostrar();
                 }else{
                    JOptionPane.showMessageDialog(null,"Elección errada");
                }   
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:

                JOptionPane.showMessageDialog(null,"Muchas gracias por usar nuestros servicios.\nEsperamos que vuelva pronto");
                break;
       }
    }
       while(op!=9);
 }
}

