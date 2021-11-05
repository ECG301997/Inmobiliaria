
package Modelo;

public class Propiedad {
    private String matricula,direccion,telefono,barrio,zona,descripcion;
    private int precio;


   public Propiedad(String matricula, String direccion, String telefono, String barrio, String zona, String descripcion, int precio) {
        this.matricula = matricula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.barrio = barrio;
        this.zona = zona;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public Propiedad(){
        
    }


    @Override
    public String toString() {
          return "Propiedad"+ 
              "\nmatricula: "+ getMatricula()+
                "\ndireccion: "+ getDireccion()+
                "\ntelefono: "+ getTelefono()+
                "\nbarrio: "+ getBarrio()+
                "\nzona: "+ getZona()+
                "\ndescripcion: "+ getDescripcion()+
                "\nprecio: "+ getPrecio();
    }
   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
