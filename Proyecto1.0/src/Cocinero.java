import java.util.ArrayList;

/**
 * Created by lucerogarcia on 29/04/17.
 */
public class Cocinero extends Empleado
{
    private ArrayList<Pedido> pedidos;

    /**
     * Constructor de Usuario
     *
     * @param nom    nombre del Usuario
     * @param correo Correo Electronico del Usuario
     * @param hor Horario del Usuario
     */
    public Cocinero(String nom, String correo, String hor)
    {
        super(nom, correo, hor);
    }

    public void pedidoListo()
    {
        for(Pedido p: pedidos)
        {
            if(p.isReady())
            {
                System.out.println(p);//sobreescribir to String
            }
        }

    }

}
