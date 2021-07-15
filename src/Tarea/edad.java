package Tarea;
import java.util.*;
//import java.util.Date;

public class edad {

    public static void main (String [] args){

        Calendar fecha = new GregorianCalendar();

        int anioactual = fecha.get(Calendar.YEAR), mesActual = fecha.get(Calendar.MONTH), diaActual = fecha.get(Calendar.DAY_OF_MONTH);
        int anio, mes, dia, aniofinal, mesfinal, diafinal;

        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese su día de nacimiento: ");
        dia = entrada.nextInt();
        while (dia < 0 || dia > 31 )
        {
            System.out.print("Ingrese un numero mayor a cero y menor a 32\n");
            dia = entrada.nextInt();
        }

        System.out.print("ingrese su mes de nacimiento: ");
        mes = entrada.nextInt();
        while (mes < 0 || mes > 12 )
        {
            System.out.print("Ingrese un numero mayor a cero y menor a 12\n");
            mes = entrada.nextInt();
        }

        System.out.print("Ingrese su año de nacimiento: ");
        anio = entrada.nextInt();
        while (anio < 0 || anio > anioactual )
        {
            System.out.print("Ingrese un año correcto\n");
            anio = entrada.nextInt();
        }

        aniofinal = (anioactual-anio);
        mesfinal = (mesActual-mes);
        diafinal = (diaActual-dia);
        System.out.print("Welcome my friend your age is : " + aniofinal + " years " +mesfinal+ " meses " +diafinal+ " días");
    }

}
