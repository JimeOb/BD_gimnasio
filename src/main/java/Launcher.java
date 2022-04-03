
import Tablas.ClienteDAO;
import Tablas.Cliente;
import Vista.Modelo;
import java.util.List;
import java.util.stream.Collectors;

public class Launcher {
    
   private Modelo app;
    
    public Launcher() {
        app = new Modelo();
        app.iniciar();
    }
    
  public static void main(String[] args) {
      
       System.out.println("hehehe");
        new Launcher();

        /*
        ClienteDAO clientedao = new ClienteDAO();
        
        clientedao.obtenerTodo();
        List<Cliente> lista = clientedao.obtenerTodo();
    //*El filtro    List<Cliente> filtronombre = lista.stream().filter(c->c.getNombre().equals("juan")).collect(Collectors.toList());
        
        for (Cliente afiliado: lista){
            System.out.println(afiliado);
        }
        */


        
        
    }
    
}
