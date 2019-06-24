package entidades;
// Generated 24/06/2019 09:49:03 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Personal generated by hbm2java
 */
public class Personal  implements java.io.Serializable {


     private int idPersonal;
     private String nombre;
     private String apellidos;
     private String dni;
     private String telefono;
     private String cargo;
     private String email;
     private Set atencions = new HashSet(0);

    public Personal() {
    }

	
    public Personal(int idPersonal, String nombre, String apellidos, String dni, String telefono, String cargo, String email) {
        this.idPersonal = idPersonal;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.cargo = cargo;
        this.email = email;
    }
    public Personal(int idPersonal, String nombre, String apellidos, String dni, String telefono, String cargo, String email, Set atencions) {
       this.idPersonal = idPersonal;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.dni = dni;
       this.telefono = telefono;
       this.cargo = cargo;
       this.email = email;
       this.atencions = atencions;
    }
   
    public int getIdPersonal() {
        return this.idPersonal;
    }
    
    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getAtencions() {
        return this.atencions;
    }
    
    public void setAtencions(Set atencions) {
        this.atencions = atencions;
    }




}


