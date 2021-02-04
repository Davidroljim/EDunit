package ed;

import java.util.Scanner;

public class Calculadora {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num1, num2;
		int eleccion;
		
	//Se le pregunta al usuario que operaci�n desea realizar
		System.out.println("Introduzca n/1 Para Sumar, n/2 Para Restar, n/3 Multiplicar, n/4 Dividir, n/5 Potencia, n/6 Resto, n/7 Seno, n/8 Coseno, n/9 Tangente, n/10 Logaritmos  ");
		eleccion = scanner.nextInt();
		if (eleccion>10) {
			
			System.out.println("Debes introducir un n�mero del 1 al 10");
	
		}else {
	/**
	 * Creamos un switch para que el usuario pueda elegir su operaci�n a realizar
	 */
		switch (eleccion) {
		
		/**
		 * En cada case se guarda la ejecuci�n del m�todo que se utiliza para cada operaci�n
		 */
		
		case 1:
			System.out.println("Introduce el primer n�mero para calcular: ");
			num1 = scanner.nextInt();
			System.out.println("Introduce el segundo n�mero para calcular: ");
			num2 = scanner.nextInt();
			
			oaBasicas1(num1, num2);
		break;
		
		case 2:
			System.out.println("Introduce el primer n�mero para calcular: ");
			num1 = scanner.nextInt();
			System.out.println("Introduce el segundo n�mero para calcular: ");
			num2 = scanner.nextInt();
			
			oaBasicas2(num1, num2);
		break;
		
		case 3:
		
			System.out.println("Introduce el primer n�mero para calcular: ");
			num1 = scanner.nextInt();
			System.out.println("Introduce el segundo n�mero para calcular: ");
			num2 = scanner.nextInt();
		
			oaBasicas3(num1, num2);
		break;
		
		case 4:
			
			System.out.println("Introduce el primer n�mero para calcular: ");
			num1 = scanner.nextInt();
			System.out.println("Introduce el segundo n�mero para calcular: ");
			num2 = scanner.nextInt();
			
			oaBasicas4(num1, num2);
		break;
		
		case 5:
			
			System.out.println("Introduce el primer n�mero al cual se le va a aplicar la potencia: ");
			num1 = scanner.nextInt();
			System.out.println("Introduce el n�mero al que quieras elevar el n�mero anterior: ");
			num2 = scanner.nextInt();
			
			potencia(num1, num2);
		break;
		
		case 6:
			
			System.out.println("Introduce el dividendo: ");
			num1 = scanner.nextInt();
			System.out.println("Introduce el divisor para calcular el resto: ");
			num2 = scanner.nextInt();
			
			resto(num1, num2);
			
		break;
		
		case 7:
			
			System.out.println("Introduzca un n�mero para calcular su seno: ");
			num1 = scanner.nextInt();
			
			seno(num1);
		break;
		
		case 8:
			
			System.out.println("Introduzca un n�mero para calcular su coseno: ");
			num1 = scanner.nextInt();
			
			coseno(num1);
			
		break;
		
		case 9:
			
			System.out.println("Introduzca un n�mero para calcular su tangente: ");
			num1 = scanner.nextInt();
			
			tangente(num1);
			
		break;
		
		case 10:
			
			System.out.println("Introduzca un n�mero para calcular su logaritmo: ");
			num1 = scanner.nextInt();
			
			logaritmos(num1);
			
		break;
			
		}
		}
		
	scanner.close();}
	
	// A los 6 primeros m�todos se le pasa 2 numeros para llevar a cabo su ejecuci�n
	/**
	 * Creamos los m�todos para cada operaci�n
	 * Pediomos al usuario el num1 y el num2 para realizar la operaci�n
	 * @param num1 es un int
	 * @param num2 es un int
	 * @return se devuelve el resultado de la suma 
	 */
	
	public static int oaBasicas1 (int num1, int num2){
		
		int suma = num1+num2;
		System.out.println("El resultado de la suma es: " +num1+ "+" +num2+ "=" + suma );
		return suma;
	}
	
	/**
	 * Metodo para calcular la resta
	 * @param num1 parametro para realizar la resta
	 * @param num2 parametro para realizar la resta
	 * @return devuelve el resultado de la resta
	 */
	
	public static int oaBasicas2 (int num1, int num2){
		
		int resta = num1-num2;
		System.out.println("El resultado de la resta es: " +num1+ "-" +num2+ "=" + resta );
		return resta;
	}
	
	/**
	 * metodo para calcular la multiplicaci�n
	 * @param num1 parametro para realizar la multiplicaci�n
	 * @param num2 parametro para realizar la multiplicaci�n
	 * @return devuelve el resultado de la multiplicaci�n
	 */
	
	public static int oaBasicas3 (int num1, int num2){
		
		int multiplicar = num1*num2;
		System.out.println("El resultado de la multiplicacion es: " +num1+ "x" +num2+ "=" + multiplicar );
		return multiplicar;
	}
	
	/**
	 * M�todo para calcular la divisi�n
	 * @param num1 parametro para realizar la divisi�n
	 * @param num2 parametro para realizar la divisi�n
	 * @return devuelve el resultado de la divisi�n
	 */
	
	public static int oaBasicas4 (int num1, int num2){
		int dividir = 0;
		 if (num2 == 0) {
			throw new ArithmeticException("Un n�mero no se puede dividir entre 0 ya que su resultado es infinito");
		 }else 
			 
			 dividir = num1/num2;
				System.out.println("El resultado de la divisi�n es: " +num1+ "/" +num2+ "=" + dividir );
				
		 return dividir;
	}
	
	/**
	 * M�todo para calcular la potencia
	 * @param num1 parametro para realizar la potencia
	 * @param num2 parametro para realizar la potencia
	 * @return devuelve el resultado de la potencia
	 */
	
	public static int potencia (int num1, int num2){
		
		int pot = (int)Math.pow(num1, num2);
		System.out.println("El resultado de" +num1+ " elevado a " +num2+ " es: " + pot );
		return pot;
	}
	
	/**
	 * M�todo para calcular el resto entre dos n�meros
	 * @param num1 parametro para realizar el resto
	 * @param num2 parametro para realizar el resto
	 * @return devuelve el resultado del resto de dichos n�meros
	 */
	
	public static int resto (int num1, int num2){
		
		int resto = num1 % num2;
		System.out.println("El resultado del resto entre los n�meros" +num1+ " y " +num2+ " es: " + resto );
		return resto;
	}
	
	/**
	 * Le pasamos una sola variable para el calculo del seno
	 * @param num1 es el n�mero que vamos a calcular
	 * @return devuelve el resultado del seno
	 */
	
	public static int seno (int num1){
		
		int nseno = Math.sin(num1);
		System.out.println("El resultado del seno del n�mero " +num1+ " es: " + nseno );
		return nseno;
	}
	
	/**
	 * M�todo para calcular el coseno
	 * @param num1 parametro para realizar el coseno
	 * @return devuelve el resultado del coseno
	 */
	
	public static int coseno (int num1){
		
		int ncoseno = Math.cos(num1);
		System.out.println("El resultado del coseno del n�mero " +num1+ " es: " + ncoseno );
		return ncoseno;
	}
	
	/**
	 * M�todo para calcular la tangente 
	 * @param num1 parametro para realizar la tangente
	 * @return devuelve el resultado de la tangente calculada
	 */
	
	public static int tangente (int num1){
		
		int ntang = Math.cos(num1);
		System.out.println("El resultado de la tangente del n�mero " +num1+ " es: " + ntang );
		return ntang;
	}
	
	/**
	 * M�todo para calcular el logaritmo
	 * @param num1 parametro para calcular su logaritmo
	 * @return devuelve el resultado del logaritmo
	 */
	
	public static int logaritmos (int num1){
		
		int log = Math.log10(num1);
		System.out.println("El resultado del logaritmo del n�mero " +num1+ " es: " + log );
		return log;
	}
}
