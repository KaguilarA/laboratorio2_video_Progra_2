package laboratorio2;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Cl {

    public static ArrayList<Tienda> listaTiendas = new ArrayList<Tienda>();
    public static ArrayList<Video> listarVideos = new ArrayList<>();
    public static ArrayList<Cliente> listarClientes = new ArrayList<>();
    /**
     * 
     * @param pnombretienda
     * @param pdireccion
     * @param pcedjuridica
     * @return validation register
     */
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
    
    /**
     * 
     * @param pCedula
     * @return validation id
     */
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
    
    /**
     * 
     * @param pnombre
     * @param papellido
     * @param pcedula
     * @param pdireccion
     * @param pnumcontrato
     * @return validation register
     */
    public static boolean registrarCliente (String pnombre, String papellido, String pcedula, String pdireccion, int pnumcontrato)
    {
        boolean registro;
        
        if(buscarCliente(pcedula) == false)
        {
            Cliente nuevoCliente = new Cliente(pnombre, papellido, pcedula, pdireccion, pnumcontrato);
            listaTiendas.get(0).getListaClientes().add(nuevoCliente);
            listarClientes.add(nuevoCliente);
            registro = true;
        }else{
            registro = false;
        }
        
        return registro;
    }
    
    /**
     * 
     * @param pCedula
     * @return validation id
     */
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
    
    /**
     * 
     * @param ptitulo
     * @param pactor
     * @param pgenero
     * @return boolean registro
     */
    public static boolean registrarVideos (String ptitulo, String pactor, String pgenero)
    {
        boolean registro = true;
        Video nuevoVideo = new Video(ptitulo, pactor, pgenero);
        listaTiendas.get(0).getListaVideos().add(nuevoVideo);
        listarVideos.add(nuevoVideo);
        registro = true;
       
        return registro;
    }
    
    /**
     * 
     * @return array listaTiendas
     */
    public static String [] getTiendas(){
        int size = listaTiendas.size();
        String [] tiendas = new String[size];
        
        for (Tienda tmpCliente:listaTiendas){
            tiendas[0] = tmpCliente.toString();
        }
        
        return tiendas;
    }
    /**
     * 
     * @return  
     */
    public static String [] getVideos(){
        int size = listarVideos.size();
        String [] videos = new String[size];
        
        for (Video tmpVideo:listarVideos){
            videos[0] = tmpVideo.toString();
        }
        
        return videos;
    }
    
    public static String [] getClientes(){
        int size = listarClientes.size();
        String [] clientes = new String[size];
        
        for (Cliente tmpVideo:listarClientes){
            clientes[0] = tmpVideo.toString();
        }
        return clientes;
    }
}
