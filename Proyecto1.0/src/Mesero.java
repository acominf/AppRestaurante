import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lucerogarcia on 29/04/17.
 */
public class Mesero extends Empleado
{
    private ArrayList <Mesa> mesasCorrespondientes;

    public Mesero(String nom, String correo, String hor)
    {
        super(nom,correo,hor);
        mesasCorrespondientes=new ArrayList<Mesa>();

    }
    /**
     *
     * @param idMesa identidicador de la mesa que se le agrega al mesero
     */
    public void agregarMesa(Mesa idMesa)//agregue esto
    {
        mesasCorrespondientes.add(idMesa);
    }

    /**
     *
     * @param pedido  el pedido de clase Pedido a agregar
     * @param idMesa el identificaddor de la mesa
     */

    public void agregarPedido(Pedido pedido, int idMesa)
    {
        for(Mesa m : mesasCorrespondientes) //Se debe usar el otro for?
        {
            if(m.accessid()==idMesa)
            {
                m.agregarPedido(pedido);
            }
        }



    }

}
