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

    /**
     * Recibe el pedido generado por el mesero
     * y lo añade a la lista de pedidos a preparar
     *
     * @param p Pedido generado por el mesero
     */
    public void añadirPedido(Pedido p)
    {
        pedidos.add(p);
    }

    /**
     * Permite al cocinero marcar un pedido
     * ya realizado como "listo"
     */
    public void pedidoListo()
    {
        for(Pedido p: pedidos)  //Falta alguna condicion para marcar solo uno
        {
            p.marcarListo();
            //aqui se remueve el pedido
        }
    }

}
