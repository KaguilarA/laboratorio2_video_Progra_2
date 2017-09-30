package laboratorio2;

/**
 *
 * @author kevin
 */
import java.io.*;
import java.util.ArrayList;

public class Ui {

    /**
     * @param args the command line arguments
     */
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Cl cl = new Cl();
    
    public static void main(String[] args)throws java.io.IOException{      
        int opcion;
        opcion = -1;
        
        do {
            out.println("<--- Seleccione la tienda --->");
            out.println("1. Agregar tiendas");
            out.println("2. Agragar clientes");
            out.println("3. Agregar videos");
            out.println("4. Listar tiendas");
            out.println("5. Listar videos");
            out.println("6. Listar clientes");
            out.println("7. Salir");
            opcion = leerOpcionDelMenu();
            opcionDelMenu(opcion);
        } while (opcion !=4);
    }
    
    static int leerOpcionDelMenu() throws IOException{
        int opcion = 0;
        out.println("Ingrese una opción");
        opcion = Integer.parseInt(in.readLine());
        return opcion;
    }
    
    static boolean opcionDelMenu(int pOpcion) throws IOException{
        boolean salir = false;
        
        switch(pOpcion){
            case 1:
               agregarTienda();
             break;
            case 2:
               agregarCliente();
            break;
            case 3:
               agragarVideo();
            break;
            case 4:
               listarTienda();
            break;
            case 5:
               listarVideo();
            break;
            case 6:
               listarClientes();
            break;
            case 7:
                salir = true;
            break;
            default:
                out.println("Opción Inválida");
            break;           
        }
        return salir;
    }

    public static void agregarTienda() throws IOException{
        String nombreTienda, direccion, cedJuridica;
        boolean resultado;
        
        out.println("Digite el nombre de la nueva Tienda");
        nombreTienda = in.readLine();
        
        out.println("Digite la direcci\u00f3n de la nueva Tienda");
        direccion = in.readLine();
        
        out.println("Digite la c\u00e9dula jur\u00eddica de la nueva Tienda");
        cedJuridica = in.readLine();
        
        resultado = cl.agregarTienda(nombreTienda, direccion, cedJuridica);
        
        if(resultado == true){
            out.println("¡Registro de usuario exitoso!");
            listarTienda();
            
        }else{
            out.println("El usuario ya se encuentra registrado");
        }
    }

    public static void agregarCliente() throws IOException
    {
        String nombre, apellido, cedula, direccion;
        int numeroContrato;
        boolean resultado;
        
        out.println("Digite el nombre del nuevo cliente");
        nombre = in.readLine();
        
        out.println("Digite el apellido del nuevo cliente");
        apellido = in.readLine();
        
        out.println("Digite la c\u00e9dula del nuevo cliente");
        cedula = in.readLine();
        
        out.println("Digite la direcci\u00f3n del nuevo cliente");
        direccion = in.readLine();
        
        out.println("Digite el n\u00famero de contrato");
        numeroContrato = Integer.parseInt(in.readLine());
        
        resultado = Cl.registrarCliente(nombre, apellido, cedula, direccion, numeroContrato);
        
        if(resultado == true){
            out.println("¡Registro de usuario exitoso!");
        }else{
            out.println("El usuario ya se encuentra registrado");
        }
    }

    public static void agragarVideo() throws IOException
    {
        String titulo, actor, genero;
        boolean resultado;
        
        out.println("Digite el t\u00edtulo del nuevo video");
        titulo = in.readLine();
        
        out.println("Digite el g\u00e9nero del nuevo video");
        actor = in.readLine();
        
        out.println("Digite el formato disponible del nuevo video");
        genero = in.readLine();
        
        resultado = cl.registrarVideos(titulo, actor, genero);
        
        if(resultado == true){
            out.println("¡Registro del video fue exitoso!");
        }else{
            out.println("Ha ocurrido un  error, int\u00e9ntelo desp\u00faes");
        }
    }
    
    public static void listarTienda(){
        String [] listaTiendas;
        listaTiendas = Cl.getTiendas();
        int tamanno = listaTiendas.length;
        
        if(tamanno != 0){
            for(int i=0; i < tamanno; i++){
                out.println(listaTiendas[i] + "\n");
                //out.println("El nombre de la tienda de la tienda es: " + listaTiendas.get(i).getNombreTienda() + ", la direccion de la tienda es: " + listaTiendas.get(i).getDireccion());
            }
        }else{
            out.println("Aún no hay tiendas registradas.");
            
        }
    }
    
    public static void listarVideo(){
        
    }
    public static void listarClientes(){
        
    }
}