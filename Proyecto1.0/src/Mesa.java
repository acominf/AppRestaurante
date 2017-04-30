/**
 * Created by lucerogarcia on 29/04/17.
 */
public class Mesa
{
    private Pedido pedido;
    private int capacidad;
    private int identificador;
    private Boolean estaOcupada;

    /**
     *
     * @param cap capacidad de la mesa
     * @param id identificador de la mesa
     */
    public Mesa(int cap, int id)
    {
        capacidad=cap;
        identificador=id;
    }

    public int accessid()
    {
        return identificador;
    }

    public void agregarPedido(Pedido p)
    {
        pedido=p;
    }

}
