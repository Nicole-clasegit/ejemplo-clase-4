/* 
 * ***********************
 * CURSO JAVA 2 SE INICIAL
 * Parte 1
 * ***********************
 */
package parte1;
import java.util.Scanner;


public class Parte1 {

    public static void main(String[] args) {
        // TODO code application logic here
        // Este es el primer programa
        // la doble barra permite los comentarios
        // los comentarios sirven para documentar el codigo
        // o para anular parte del codigo
        
        // no usamos acentos por que se distorciona

        //impresión en pantalla
        System.out.println("Hola Mundo");
        System.out.println("JAVA 2 SE");
        System.out.print("1"); //imprime en una misma linea
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.print("5");
        System.out.println("probando");
        System.out.println("");
        System.out.println("");
        // sout seguido de la tecla TAB es el metodo abreviado de println

        System.out.println("Hola mundo \n\n");
        // \n hace que se deje una linea extra despues imprimir en consola
        
        System.out.println("\thola");
		// \t deja espacio de tabulación antes de imprimir
		
		System.out.println("\n\n\thola");
		// puedo combinar los modificadores
		
		
        
        // JAVA no tiene una instrucción que limpie la consola
        // Otros lenguajes si
        
        
        
        /* probando mas comentarios
         * este es un bloque de comentarios
         * mas comentarios en java
         * Octubre 2012
         */

        //definición de variables enteras
        //los nombres de variables se fijan en minusculas
        int a;      //defini una variable
        a = 2;        //asigne valor a la variable

        int b = 3;    //defini y asigne valor en una sola linea

        int q = 4, w = 5, r = 20; // puedo definir y asignar varias variables

        // int a=4;
        // sólo se puede definir una ves la variable

        a = 30;
        a = 40;
        a = 2;
        // pero puede asignar valor cuantas veces quiera

        int c = a + b;
        int d = 100;

        System.out.print("Variable A = ");
        System.out.println(a);
        System.out.print("Variable B = ");
        System.out.println(b);
        System.out.print("Variable C = ");
        System.out.println(c);
        System.out.print("Variable D = ");
        System.out.println(d);

        System.out.println("A + B = " + a + b); // eror produce la concatenadion

        System.out.print("A + B = ");
        System.out.println(a + b);

        System.out.println("A + B = " + (a + b));
        
        // los nombres de todos los tipos de variables van en minusculas
        // es una convención, los nombres de variables pueden tener
        // letras y números, pero no pueden iniciar su nombre en número
        // para nombres de varias palabras se usa camelCase
		// camelCase : letra camello inicia todominuscula, pero cada palabra empieza en mayuscula
        // Ejemplo: int=controlTemperatura2;
        // no se puede int 2controlTemperatura; //ERROR
       
        
        
        //Variables String
        String p;
        String l;
        String f;
        
        p = "Perro";
        l = "Ladra";
        f = "fuerte";

        //String p="perro";          //permitido
        //String p="perro", l="ladra",f="fuerte"; //permitido
        
        System.out.println(p + l);

        System.out.println(p + " " + l);

        System.out.println(p + c);
        System.out.println("2"+2);
        // Siempre que hay un termino String o literal, el operador +
        // actua como concatenador, no suma.
        
        //System.out.println("el {0} que {1} muy {2}",p,l,f);
        // no funciona es este lenguage, si en C o C#
        
        
        //Variables Chars
        char o;
        char i;
        o = (65);
        i = (67);
        System.out.println(o + " " + i);


        //Variables Booleans
        boolean z;
        z = true;
        System.out.println(z);
        z = false;
        System.out.println(z);

        // Variables float
        float fl = 0;
        System.out.println(fl);
        fl = 95.60f;
        System.out.println(fl);

        // Variables double
        double dl = 0;
        System.out.println(dl);
        dl = 95.60d;
        System.out.println(dl);

		//        int u;
        //        System.out.println(u);
        // las variables no se inicializan en ningun valor

        //Operadores de Asignación
        
        int nro1 = 5;
        int nro2 = 7;

        System.out.println(nro1);
        System.out.println(nro2);


        nro1 = nro2;
        // el igual es el operador de asignación y
        // la asignacion se produce de derecha a izquierda

        System.out.println(nro1);
        System.out.println(nro2);

        
        // INCREMENTALES
        
        //suma 1 a la variable
        nro1++; // es eficiente que la segunda
        // nro1=nro1+1 // ambas producen el mismo resultado
        System.out.println(nro1);



        //resta 1 a la variable
        nro1--;
        // nro1=nro1-1
        System.out.println(nro1);

        //agregar un valor a la variable
        nro1 += 7;
        //nro1=nro1+7
        System.out.println(nro1);

        //quitar un valor a la variable
        nro1 -= 7;
        //nro1=nro1-7
        System.out.println(nro1);

        //Multiplicar por un valor a la variable
        nro1 *= 5;
        //nro1=nro1*5
        System.out.println(nro1);

        //Dividir por un valor a la variable
        nro1 /= 5;
        //nro1=nro1/5
        System.out.println(nro1);
		
		// los operadores ++ -- += -= *= /=
		// no llevan espacios entre los 2 caracteres
		// no se le puede cambiar el orden de los caracteres
		

        // separador de consola para no mesclar los resultados

        System.out.println("-------------------------------");

        System.out.println(nro1);
        System.out.println(nro1++); //primero imprime despues suma
        System.out.println(nro1); // el resultado de la suma lo vemos aca


        System.out.println("-------------------------------");

        System.out.println(nro1);
        System.out.println(++nro1); //primero suma despues imprime
        System.out.println(nro1);

        
        // tablas de verdad
        //--------------------------
        //  X   Y       Or      And
        //  F   F       F       F
        //  F   V       V       F
        //  V   F       V       F
        //  V   V       V       V



        //operaciones lógicas
        //   &&  operador Y Lógico
        //   ||  operador O Lógico (ALT 124)
        //   !  Operador NOT
        //   =!  operador no igual
        //   == operador de comparación  
		
		// los operadores logicos primero analiza el operador
		// y despues los terminos
		

        boolean log1 = true;
        boolean log2 = false;
        boolean resultado1 = log1 && log2;
        System.out.println(resultado1);
        System.out.println(log1 || log2);
        System.out.println(resultado1 || log2);
        System.out.println(!log1);
        log1 = !log2;
        System.out.println(log1);

        // cuidado con el doble negado
        System.out.println(! !log1);

        // operadores 
        //   &  operador Y 
        //   |  operador O 
        // Estos operadores siempre analizan los dos terminos
        // y despues la operación

		
        System.out.println(log1 | log2);
        System.out.println(log1 & log2);

        System.out.println("mas operadores Logicos");
        int nro3 = 4;
        int nro4 = 4;
        int nro5 = 5;
        System.out.println(nro3 == nro4);
        System.out.println(nro3 != nro4);
        System.out.println(nro4 == nro5);

        System.out.println("mas todavia");
        System.out.println(nro3 > 4);
        System.out.println(nro3 > 4 && nro1 > nro2);
        System.out.println(nro3 > 0 && nro1 + nro2 == 10);
		
		// los operadores == != >= <=
		// no llevan espacios entre los 2 caracteres
		// no se le puede cambiar el orden de los caracteres
		
		
		

        // Definición de constantes usando final y en mayusculas

        // la palabra final define a las constantes
        // por conveción los nombres de constantes van en mayusculas
        final float PI = 3.14f;
        System.out.println(PI);
        //  Esto No es posible  DOLAR=DOLAR +1
        System.out.println(PI);
    }
}