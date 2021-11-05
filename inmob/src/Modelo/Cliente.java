
package Modelo;

public class Cliente {
    String nombre,telefono,direccion,profesion,trabajo,desc_propiedad;
    int salario;

    public Cliente(String nombre, String telefono, String direccion, String profesion, String trabajo, String desc_propiedad, int salario) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.profesion = profesion;
        this.trabajo = trabajo;
        this.desc_propiedad = desc_propiedad;
        this.salario = salario;
    }
    @Override
    public String toString() {
          return "Cliente"+ 
              "\nNombre: "+ getNombre()+
                "\nTeléfono: "+getTelefono()+
                "\nDirección: "+ getDireccion()+
                "\nProfesión:: "+ getProfesion()+
                "\nTrabajo: "+ getTrabajo()+
                "\nDescripción Propiedad: "+ getDesc_propiedad()+
                "\nSalario: "+ getSalario();
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getDesc_propiedad() {
        return desc_propiedad;
    }

    public void setDesc_propiedad(String desc_propiedad) {
        this.desc_propiedad = desc_propiedad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
