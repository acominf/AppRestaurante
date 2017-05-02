import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lucerogarcia on 29/04/17.
 */
public class Restaurante
{
    private String nombre;
    private String direccion;
    private String telefono;
    private String horario; //quizás cambie
    private ArrayList<Empleado> empleados;
    private ArrayList<Mesa> mesas;
    private Menu menu;
    private int cantSeccion;

    public Restaurante(String nom, String dir, String tel, String hor)
    {
        /*No me termine de convencer y lo deje en comentarios jeje
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("dirección: ");
        direccion = sc.nextLine();
        System.out.println("Telefono: ");
        telefono = sc.nextLine();
        System.out.println("Horario: ");
        horario = sc.nextLine();*/
        nombre = nom;
        direccion = dir;
        telefono = tel;
        horario = hor;
        empleados = new ArrayList<Empleado>();
        mesas = new ArrayList<Mesa>();
    }

    public void agregarEmpleado(Empleado nuevo)
    {
        empleados.add(nuevo);
    }

    public String regresaNombre()
    {
        return nombre;
    }
}
