package laboratorio2;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Cl {

    public static ArrayList<Tienda> listaTiendas = new ArrayList<Tienda>();
    
    public static boolean agregarTienda(String pnombretienda, String pdireccion, String pcedjuridica)
    {
        boolean registro = false;
        
        if(buscarTienda(pcedjuridica) == false)
        {
            Tienda nuevaTienda = new Tienda(pnombretienda, pdireccion, pcedjuridica);
            listaTiendas.add(nuevaTienda);
            registro = true;
        }
        
        return registro;
    }
    
    public static boolean buscarTienda (String pCedula)
    {
        boolean existe = false;
        
        for (Tienda tmpTienda:listaTiendas){
            if(tmpTienda.getCedula().equals(pCedula)){
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    
    public static boolean registrarCliente (String pnombre, String papellido, String pcedula, String pdireccion, int pnumcontrato)
    {
        boolean registro;
        
        if(buscarCliente(pcedula) == false)
        {
            Cliente nuevoCliente = new Cliente(pnombre, papellido, pcedula, pdireccion, pnumcontrato);
            listaTiendas.get(0).getListaClientes().add(nuevoCliente);
            registro = true;
        }else{
            registro = false;
        }
        
        return registro;
    }
    
    public static boolean buscarCliente (String pCedula)
    {
        boolean existe = false;
        
        for (int i = 0; i<listaTiendas.size(); i++){
            for (Cliente tmpCliente:listaTiendas.get(i).getListaClientes()){
                if(tmpCliente.getCedula().equals(pCedula)){
                    existe = true;
                    break;
                }
            }
        }
        
        
        return existe;
    }
    
    public static boolean registrarVideos (String ptitulo, String pactor, String pgenero)
    {
        boolean registro = true;
        Video nuevoVideo = new Video(ptitulo, pactor, pgenero);
        
        return registro;
    }
    
    public static ArrayList listaTiendas(){
        return listaTiendas;
    }
}
