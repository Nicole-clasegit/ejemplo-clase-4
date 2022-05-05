
public class Operdores {

	public static void main(String[] args) {

                /**
                * Operadores Aritm�ticos
                * (+) Suma num1 + num2 
                * (-) Resta num1 - num2 
                * (*) Multiplicaci�n num1 * num2 
                * (/) Divisi�n	num1 / num2
                * (%) M�dulo o Resto num1 % num2
                */

                System.out.println("---------Aritm�ticos---------");
                int num1, num2, operacion;

                //asignamos valores iniciales a las variables
                num1 = 5;
                num2 = 3;

                operacion = num1 + num2;
                // imprimimos el resultado
                System.out.println("Suma:");
                System.out.println(operacion);

                operacion = num1 - num2;
                // imprimimos el resultado
                System.out.println("Resta:");
                System.out.println(operacion);

                operacion = num1 * num2;
                // imprimimos el resultado
                System.out.println("Multiplicaci�n:");
                System.out.println(operacion);

                operacion = num1 / num2;
                // imprimimos el resultado
                //el resultado en esta operacion devolvera un numero entero ya que operamos con enteros (int)
                System.out.println("Divisi�n:");
                System.out.println(operacion);

                operacion = num1 % num2;
                // imprimimos el resultado
                System.out.println("Resto:");
                System.out.println(operacion);
                /**
                * = Asignaci�n num1 = num2
                * += Suma y asignaci�n num1 += num2 (num1=num1 + num2)
                * -= Resta y asignaci�n num1 -= num2 (num1=num1 - num2)
                * *= Multiplicaci�n y asignaci�n num1 *= num2 (num1=num1 * num2)
                * /= Divisi�n y asignaci�n num1 / num2 (num1=num1 / num2)
                * %= M�dulo y asignaci�n num1 % num2 (num1=num1 % num2)
                */
                System.out.println("---------Asignaci�n---------");
                
                //asignamos valores nuevos a las variables
                num1 = 60;
                num2 = 15;
                
                num1 = num2;
                System.out.println("Asignaci�n:");
                System.out.println(num1);

                num1 += num2;
                System.out.println("Suma:");
                System.out.println(num1);

                num1 -= num2;
                System.out.println("Resta:");
                System.out.println(num1);

                num1 *= num2;
                System.out.println("Multiplicaci�n:");
                System.out.println(num1);

                num1 /= num2;
                System.out.println("Divisi�n:");
                System.out.println(num1);

                num1 %= num2;
                System.out.println("Resto:");
                System.out.println(num1);     
                

                /**
                * Operadores L�gicos
                * (&&) AND op1 && op2
                * (&) AND Inclusivo op1 & op2    
                * (||) OR op1 || op2
                * (|) OR Inclusivo op1 | op2     
                * (!) NOT !op1
                */
                System.out.println("---------L�gicos---------");
                boolean op1, op2;
                //asignamos valores iniciales a las variables

                op1 = true;
                op2 = false;

                //para poder verificar estos operadores los vamos a usar en la consola
                // imprimimos la operacion 
                System.out.println("AND:");
                System.out.println(op1 && op2);

                // imprimimos la operacion 
                System.out.println("OR:");
                System.out.println(op1 || op2);

                // imprimimos la operacion 
                System.out.println("Negacion:");
                System.out.println(!op1);
                System.out.println(!op2);

                // imprimimos la operacion 
                System.out.println("AND Inclusivo:");
                System.out.println(op2 & op1);

                // imprimimos la operacion 
                System.out.println("OR Inclusivo:");
                System.out.println(op2 | op1);
        
                /**
                * Operadores Relacionales (Comparacion)
                * == Igualdad num1 == num2 
                * != Distinto num1 != num2
                * < Menor que num1 < num2
                * > Mayor que num1 > num2
                * <= Menor o igual que num1 <= num2
                * >= Mayor o igual que num1 >= num2
                */
                
                System.out.println("---------Relacionales---------");

                //asignamos valores nuevos a las variables
                num1 = 45;
                num2 = 43;
        
                // imprimimos la operacion 
                System.out.println("Igualdad:");
                System.out.println(num1 == num2);

                // imprimimos la operacion 
                System.out.println("Distinto:");
                System.out.println(num1 != num2);

                // imprimimos la operacion 
                System.out.println("Mayor:");
                System.out.println(num1 > num2);

                // imprimimos la operacion 
                System.out.println("Menor:");
                System.out.println(num1 < num2);
                
                // imprimimos la operacion 
                System.out.println("Mayor Igual:");
                System.out.println(num1 >= num2);

                // imprimimos la operacion 
                System.out.println("Menor Igual:");
                System.out.println(num1 <= num2);
                
                
                /*
                * Operadores Incrementales
                * (++) para incrementar de uno en uno
                * (--) para disminuir de uno en uno
                */
                System.out.println("---------Incrementales---------");
                int cantidad = 0;

                cantidad++;
                // imprimimos la operacion 
                System.out.println("Incremetar:");
                System.out.println(cantidad);
                
                // incrementar y despues usar
                System.out.println("Incremetar y despues usar:");
                System.out.println(++cantidad);
                System.out.println("cantidad = " + cantidad);
                
                // incrementar y despues usar
                System.out.println("Usar y despues incrementar:");
                System.out.println(cantidad++);
                System.out.println("cantidad = " + cantidad);
                
                cantidad--;
                // imprimimos la operacion 
                System.out.println("Disminuir:");
                System.out.println(cantidad);
                
                // incrementar y despues usar
                System.out.println("Disminuir y despues usar:");
                System.out.println(--cantidad);
                System.out.println("cantidad = " + cantidad);
                
                // incrementar y despues usar
                System.out.println("Usar y despues Disminuir:");
                System.out.println(cantidad--);
                System.out.println("cantidad = " + cantidad);
        }

}
