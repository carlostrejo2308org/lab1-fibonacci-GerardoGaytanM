import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int a=0,b=1,c,n;

        System.out.print("Ingresa la cantidad de elementos para la serie:");
        n= keyboard.nextInt();
        for(int i=0; i<n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
Ejemplo 1er error
int num1,num2;     //El lexico identifica lo siguiente,
  if(num1|&num2|){ //En la 1er linea declara palabra reservada de dos variables de tipo entero
         }         // if es una palabra reservada
                   //( parentesis izquierdo apertura
                   // num1 variable constante entera
                   // | operador OR invalido (mal construido)
                  // num2 variable constante entera
                 // | operador OR invalido (mal construido)
                 //( parentesis derecho cierre

Ejemplo 2do error
String ="Sistemas;   //El lexico identifica lo siguiente
                    //En la 1er linea declara palabra reservada de tipo String
                   //constante String(Sistemas) mal contruido, no encontro comillas(")de cierre

Ejemplo 3er error
FLOAT=3,1416;      //El lexico identifica lo siguiente
                  //En la 1er linea declara palabra mal escrita la cual no reconoce debe ser(float)
                  //En tipo float esta mal construida la constante real ya que no lleva coma(,)si no un(.)
Ejemplo 1er error
while x<0;      //La sintaxis indentifica lo siguiente
                //En la 1er linea declara palabra reservada while la cual le falta el parentesis de la estructura

Ejemplo 2do error
int s;                                //La sintaxis indentifica lo siguiente
System.out.println("Welcome to " + s) //En la 1er linea declara palabra reservada int
                                      //Imprime el mensaje el cual no tiene el cierre de (;)

if(x=3){                                                 //La sintaxis indentifica lo siguiente
   System.out.println("El numero es mayor de tres" + x); //En la 1er linea declara palabra reservada if,
                                                        //( parentesis izquierdo(apertura)
        }                                               //en la comparacion utiliza el operador de asignación "="
                                                        // en lugar de la comparación operador "==."
                                                      //( parentesis derecho(cierre)