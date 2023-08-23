import java.util.Scanner;

public class Conversor {
	
	public static void main(String[] args) {
		EXTERNA:
	while(true) {
		System.out.println("CONVERSOR DE MONEDA");
		System.out.println("1 - Pesos COlombianos a dolares\n" 
				+ "2 - Pesos Mexicanos a dolares \n"
				+ "3 - Soles Peruanos a dolares \n"
				+ "4 - Salir");
		System.out.println("INGRESE UNA OPCIÓN : ");
		Scanner leer = new Scanner(System.in);
		char opcion = leer.next().charAt(0);
		
	
		switch(opcion){
		case '1':
			convertir(110.557, " Pesos Colombianos");
			break;
		case '2':
			convertir(454.48, "Pesos Mexicanos");
			break;
		case '3':
			convertir(3.72, " Soles Peruanos");
			break;
		
		case '4':
			System.out.println("CERRANDO PROGRAMA");
			break EXTERNA;
			default:
				System.out.println("OPCION INCORRECTA");
			break;
			
		}
	}
	}
	static void convertir(double valorDolar, String pais) {
			Scanner leer = new Scanner(System.in);
			System.out.printf("Ingrese la cantidad de %s : ", pais );
			double cantidadMoneda = leer.nextDouble();
			
			double dolares = cantidadMoneda / valorDolar;
			
			dolares = (double)Math.round(dolares * 100d)/100;
			
			System.out.println("---------------------------------");
			System.out.println("     Tienes $" +dolares+" Dolares");
			System.out.println("---------------------------------");
	}
	
}
