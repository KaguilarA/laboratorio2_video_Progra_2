package laboratorio2;

/**
 *
 * @author kevin
 */

import java.time.*;

public class Cliente {
    private String nombre, apellido, direccion, cedula;
    private int numContrato;
    private LocalDate fechaRegistro = LocalDate.now();
    private static int id;
    
    //Construtores
    public Cliente(){
        id++;
    }
    
    public Cliente(String pnombre, String papellido, String pcedula, String pdireccion, int pnumcontrato){
        this.setNombre(pnombre);
        this.setApellido(papellido);
        this.setCedula(pcedula);
        this.setDireccion(pdireccion);
        this.setNumContrato(pnumcontrato);
        id++;
    }
    
    //Set's
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }
    public void setCedula(String cedula) 
    {
        this.cedula = cedula;
    }
    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
    public void setNumContrato(int numContrato) 
    {
        this.numContrato = numContrato;
    }
    
    // Get's
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getCedula() {
        return cedula;
    }
    public int getNumContrato() {
        return numContrato;
    }

}
