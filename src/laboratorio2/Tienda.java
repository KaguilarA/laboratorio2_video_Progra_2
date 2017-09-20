package laboratorio2;

/**
 *
 * @author kevin
 */
import java.util.ArrayList;

public class Tienda {

    private String nombreTienda, direccion, cedJuridica;
    private ArrayList<Video> listaVideos = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static int id;
    
    public Tienda()
    {
        id++;
    }
    // Construtor
    public Tienda(String pnombre, String pdireccion, String pcedula)
    {
        this.setNombreTienda(pnombre);
        this.setDireccion(pdireccion);
        this.setCedTienda(pcedula);
        id++;
    }
    
    //Get nombre
    public String getNombreTienda() {
        return nombreTienda;
    }
    //get direccion
    public String getDireccion() {
        return direccion;
    }
    //get ced
    public String getCedula() {
        return cedJuridica;
    }
    public ArrayList<Video> getListaVideos() {
        return listaVideos;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    // Set nombre tienda
    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
    // Set direccion tienda
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    // Set cedula tienda
    public void setCedTienda(String cedJuridica) {
        this.cedJuridica = cedJuridica;
    }

    public void setListaVideos(ArrayList<Video> listaVideos) {
        this.listaVideos = listaVideos;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
  
}
