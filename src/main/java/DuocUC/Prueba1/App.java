package DuocUC.Prueba1;

import java.util.Locale;
import java.util.regex.Pattern;

import DuocUC.DTO.ClubDeportivo;
import DuocUC.DTO.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("¡Bienvenido! Estamos configurando la aplicación para ti...");
        Locale chileLocale = new Locale("es", "CL");
        Locale.setDefault(chileLocale);
        
        System.out.println("===========================");
        System.out.println("Creando Usuarios:");
        Usuario user1 = new Usuario();
        

        System.out.println("===========================");
        System.out.println("Creando Clubes Deportivos:");
        ClubDeportivo cd_ar = new ClubDeportivo();
        cd_ar.setNombre("Arsenal de Coquimbo");
        cd_ar.setLema("Cañones a los puertos");
        cd_ar.setValorSuscripcion(10050);
        cd_ar.setColores("Amarillo, Rojo");
        System.out.println("Creado Club Deportivo "+ cd_ar.getNombre() + " ;; detalle: "+ cd_ar);

        ClubDeportivo cd_mc = new ClubDeportivo();
        cd_mc.setNombre("Manquehue City");
        cd_mc.setLema("Vivir y Fuerza");
        cd_mc.setValorSuscripcion(15100);
        cd_mc.setColores("Celeste, Blanco");
        System.out.println("Creado Club Deportivo "+ cd_mc.getNombre() + " ;; detalle: "+ cd_mc);

        System.out.println("===========================");
    }
}