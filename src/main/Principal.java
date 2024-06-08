package main;

import java.util.Scanner;
import consult.ConsultaMoneda;
import model.Moneda;


public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ConsultaMoneda consulta = new ConsultaMoneda();
		Moneda moneda = null;
		int opcion = 0;
		Double monto = 0.0;
		
		while(opcion != 9) {
			System.out.println("********************************************");
			System.out.println("* Bienvenidos al Conversor de monedas !!!! *");
			System.out.println("*                                          *");
			System.out.println("* 1. Dolares a Soles.                      *");
			System.out.println("* 2. Soles a Dolares.                      *");
			System.out.println("* 3. Dolares a Pesos Colombianos.          *");
			System.out.println("* 4. Pesos Colombianos a Dolares.          *");
			System.out.println("* 5. Dolares a Real Brasileño.             *");
			System.out.println("* 6. Real Brasileño a Dolares              *");
			System.out.println("* 7. Dolares a Pesos Argentinos.           *");
			System.out.println("* 8. Pesos Argentinos a Dolares            *");
			System.out.println("* 9. SALIR.                                *");
			System.out.println("********************************************");
			System.out.println("Elija su opción deseada:");
            try {
            	opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                        case 1:
                            System.out.println("Ingrese el monto a convertir:");
                            monto  = Double.parseDouble(scanner.nextLine());
                            moneda = consulta.buscaMoneda("USD","PEN", monto);

                            System.out.println("El monto es: " + moneda.conversion_result());
                            break;
                        case 2:
                            System.out.println("Ingrese el monto a convertir:");
                            monto  = Double.parseDouble(scanner.nextLine());
                            moneda = consulta.buscaMoneda("PEN","USD", monto);

                            System.out.println("El monto es: " + moneda.conversion_result());
                            break;
                        case 3:
                            System.out.println("Ingrese el monto a convertir:");
                            monto  = Double.parseDouble(scanner.nextLine());
                            moneda = consulta.buscaMoneda("USD","BOB", monto);

                            System.out.println("El monto es: " + moneda.conversion_result());
                            break;
                        case 4:
                            System.out.println("Ingrese el monto a convertir:");
                            monto  = Double.parseDouble(scanner.nextLine());
                            moneda = consulta.buscaMoneda("BOB","USD", monto);

                            System.out.println("El monto es: " + moneda.conversion_result());
                            break;
                        case 5:
                            System.out.println("Ingrese el monto a convertir:");
                            monto  = Double.parseDouble(scanner.nextLine());
                            moneda = consulta.buscaMoneda("USD","BRL", monto);

                            System.out.println("El monto es: " + moneda.conversion_result());
                            break;
                        case 6:
                            System.out.println("Ingrese el monto a convertir:");
                            monto  = Double.parseDouble(scanner.nextLine());
                            moneda = consulta.buscaMoneda("BRL","USD", monto);

                            System.out.println("El monto es: " + moneda.conversion_result());
                            break;
                        case 7:
                            System.out.println("Ingrese el monto a convertir:");
                            monto  = Double.parseDouble(scanner.nextLine());
                            moneda = consulta.buscaMoneda("USD","ARS", monto);

                            System.out.println("El monto es: " + moneda.conversion_result());
                            break;
                        case 8:
                            System.out.println("Ingrese el monto a convertir:");
                            monto  = Double.parseDouble(scanner.nextLine());
                            moneda = consulta.buscaMoneda("ARS","USD", monto);

                            System.out.println("El monto es: " + moneda.conversion_result());
                            break;
                        case 9:
                            break;
                        default:
                        System.out.println("Ingrese un numero valido"); 
                        
                }
                
            }catch (NumberFormatException e) {
            	System.out.println("ERROR INGRESA UNA OPCION VALIDA: " + e.getMessage());
            }
            
		}
	}
}
