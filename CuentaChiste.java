
import java.util.Scanner;

/* Clase CuentaChiste
 */
public class CuentaChiste
{
    
    private BancoChistes bancoChistes;
    private Scanner teclado = new Scanner(System.in);

    // Método constructor para CuentaChiste
    public CuentaChiste()
    {

        bancoChistes = new BancoChistes();
        bancoChistes.inicializar();
    }



    public void contarChiste()
    {
        if (bancoChistes.hayAlgunChisteSinLeer())
        {
            Chiste chisteAleatorio = bancoChistes.obtenerChisteAleatorio();
            chisteAleatorio.setLeido(true);
            System.out.println(chisteAleatorio.getContenido());
        } else
        {
            System.out.println("Ya se han leído todos los chistes.");
        }
    }

    public void mostrarChistes()
    {
        for (int i = 0; i <= bancoChistes.getUltimoChiste(); i++) {
            if (!bancoChistes.getChiste(i).isLeido()) {
                System.out.println(i + "  " + bancoChistes.getChiste(i).getContenido());
            }
        }
    }

    public  void anhadirChiste()
    {
        System.out.println("Escribe nuevo chiste:");
        String nuevoChiste = teclado.nextLine();
        bancoChistes.agregarChiste(nuevoChiste);
    }

    public void borrarChiste()
    {
        System.out.println("¿Cuál desea eliminar?");
        int posicionChiste = teclado.nextInt();
        bancoChistes.borrarChiste(posicionChiste);
    }



}
