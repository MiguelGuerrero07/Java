
import java.util.Scanner;

//Comentario Simple ,no afecta nada.

public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Hola Mundo Java");

        //Variables: Especificar el tipo de dato
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

//Modificamos el valor de la variable y se puede reutilizar
        miVariableEntera = 20;
        System.out.println(miVariableEntera);

        //Permite asigar cadenas de textos
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //Var -Inferencia de tipos en Java a partir de la version 10
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Hola";
        System.out.println(miVariableCadena2);
        //Concatenar 
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //Concatenación en Java
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;

        System.out.println("union = " + union);

        //Numero y Cadenas 
        var i = 3;
        var j = 4;

        System.out.println(i + j); //Realiza la suman de numeros

        System.out.println(i + j + usuario); //Se evaluan las expresiones , primero numeros y depues cadenas 

        System.out.println(usuario + i + j); //Contexto cadena , todo lo demas lo toma como cadena

        System.out.println(usuario + (i + j)); //Cambiamos la prioridad atraves de los parentesis

        //Caracteres especiales
        var nombre = "Karla";

        System.out.println("Nueva Linea:  \n" + nombre); //Salto de linea

        System.out.println("Tabulador \t" + nombre); //Espacio defeinido al ultim caraacter 

        System.out.println("Retoceso: \b" + nombre); //Regresa una posicion a la salida del programa al numero de caracteres

        System.out.println("Retoceso: \b\b" + nombre);

        System.out.println("Comilla Simple: \'" + nombre + "\'");

        System.out.println("Comilla Doble: \"" + nombre + "\" ");

        //Clase scanner 
        
        System.out.println("Ecribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario1 = consola.nextLine(); //Detine la ejecución del programa y lo asigna a la variable de manera automatica
        System.out.println("usuario1 = " + usuario1);
        System.out.println("Escribe tu titulo");
        var titulo1 = consola.nextLine();
        System.out.println("Resultado: " + titulo1  + " " + usuario1);

    }
}
