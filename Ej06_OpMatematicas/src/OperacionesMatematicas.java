import java.util.Scanner;

public class OperacionesMatematicas {
	public static void main(String[] args) {
		
		String arrayStrings[] = new String[5];
		int contador = 0;
		do {			
			double numero1 = pedirNumero("Numero1");
			double numero2 = pedirNumero("Numero2");
			
			if (esPositivo(numero1) && esPositivo(numero2)) {

				double resultadoSuma = sumar(numero1, numero2);
				// resultadoSuma = sumar(2,3,5);
				double resultadoResta = restar(numero1, numero2);
				double resultadoMultiplicacion = multiplicar(numero1, numero2);
				double resultadoDivision = 0;
				if (!esCero(numero2)) {
					resultadoDivision = dividir(numero1, numero2);
				}

				mostrarValores(resultadoSuma, resultadoResta, resultadoMultiplicacion, resultadoDivision);
				arrayStrings = guardarValores(numero1,numero2,arrayStrings,contador);
				contador++;
			} else {
				System.out.println("El numero 1 y el numero 2 deben de ser" + " positivos");
			}
		} while (continuar() && contador <= 4);
		
		if(contador == 5){
			System.out.println("El array esta lleno");
		}
		
		mostrarArray(arrayStrings);
		
		System.out.println("Programa terminado");
	}


	private static void mostrarArray(String[] arrayStrings) {
		System.out.println("----------------");
		for(String cadena : arrayStrings){
			System.out.println(cadena);
		}
		System.out.println("----------------");
	}


	private static String[] guardarValores(double numero1, 
									double numero2, 
									String[] arrayStrings, 
									int contador) {
		String cadena = numero1 + "-" + numero2;
		arrayStrings[contador] = cadena;
		return arrayStrings;
	}


	public static boolean continuar() {
		System.out.println("Desea introducir otros numeros? S/N:");
		Scanner sc = new Scanner(System.in);
		boolean continuar = false;
		String texto = sc.nextLine();
		if (texto.equalsIgnoreCase("S")) {
			continuar = true;
		}
		return continuar;
	}

	public static boolean esPositivo(double numero) {
		boolean esPositivo = false;
		if (numero >= 0) {
			esPositivo = true;
		}
		return esPositivo;
	}

	public static boolean esCero(double numero) {
		boolean esCero = false;
		if (numero == 0) {
			esCero = true;
		}
		return esCero;
	}

	public static double pedirNumero(String numero) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el " + numero + ":");
		double dNumero = sc.nextDouble();
		return dNumero;
	}

	public static double sumar(double numero1, double numero2) {
		double suma = numero1 + numero2;
		return suma;
	}

	public static int sumar(int numero1, int numero2) {
		int suma = numero1 + numero2;
		return suma;
	}

	public static double sumar(double numero1, double numero2, double numero3) {
		double suma = numero1 + numero2 + numero3;
		return suma;
	}

	public static double sumar(double... valores) {
		return 0;
	}

	public static double restar(double numero1, double numero2) {
		double resta = numero1 - numero2;
		return resta;
	}

	public static double multiplicar(double numero1, double numero2) {
		double multiplicacion = numero1 * numero2;
		return multiplicacion;
	}

	public static double dividir(double numero1, double numero2) {
		double division = numero1 / numero2;
		return division;

	}

	public static void mostrarValores(double suma, double resta, double multiplicacion, double division) {
		System.out.println("--------------");
		System.out.println("--Resultados--");
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicacion: " + multiplicacion);
		System.out.println("Division: " + division);
	}
}
