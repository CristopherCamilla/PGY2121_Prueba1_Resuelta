package DuocUC.Prueba1;

import java.util.Locale;

import DuocUC.DTO.ClubDeportivo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Locale chileLocale = new Locale("es", "CL");
        Locale.setDefault(chileLocale);

        ClubDeportivo cd_ar = new ClubDeportivo();
        cd_ar.setNombre("Arsenal de Coquimbo");
        cd_ar.setLema("Cañones a los puertos");
        cd_ar.setValorSuscripcion(10050);
        cd_ar.setColores("Amarillo, Rojo");

        ClubDeportivo cd_mc = new ClubDeportivo();
        cd_mc.setNombre("Manquehue City");
        cd_mc.setLema("Vivir y Fuerza");
        cd_mc.setValorSuscripcion(15100);
        cd_mc.setColores("Celeste, Blanco");

        System.out.println(cd_ar);
        System.out.println(cd_mc);
    }
}