package laboratorio2;

/**
 *
 * @author kevin
 */
import java.util.ArrayList;

public class Video {
    private String titulo, actor, genero;
    private static int id;
    
    public Video()
    {
        id++;
    }
    
    public Video(String ptitulo, String pactor, String pgenero)
    {
        this.setTitulo(ptitulo);
        this.setActor(pactor);
        this.setGenero(pgenero);
        id++;
    }
    
    // Set
    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }
    public void setActor(String actor) 
    {
        this.actor = actor;
    }
    public void setGenero(String genero) 
    {
        this.genero = genero;
    }
            
    // Get
    public String getTitulo() 
    {
        return titulo;
    }
    public String getActor() 
    {
        return actor;
    }
    public String getGenero() 
    {
        return genero;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", actor=" + actor + ", genero=" + genero + '}';
    }
    
}
