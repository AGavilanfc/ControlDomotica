import java.util.Scanner;
public class CDisplay {

	public static void main(String[] args) {
		
		int systemToChoose;
		Scanner teclado = new Scanner(System.in);
		
		do {
			do {
		
				System.out.println("Introduce el sistema a consultar o modificar: \n1 - Sistema de temperaturas. \n2 - Sistema de iluminación. "
						+ "\n3 - Sistema de vigilancia. \n4 - Apagar sistema de domótica.");
				systemToChoose = teclado.nextInt();
				
			} while (systemToChoose < 1 || systemToChoose > 4);
			
			if (systemToChoose == 1) {
				
				int actionToChoose;
				
				int diasMes;
				
				float temperaturasMaxMaxima;
				
				float temperaturasMaxMinima;
				
				float temperaturasMinMaxima;
				
				float temperaturasMinMinima;
				
				int decimalFormat;
				
				CControlTemperaturas controlTemperaturas = null;
				
				do {
					
					do {
						System.out.println("Acciones disponibles: \n1 - Tomar temperaturas del mes. \n2 - Imprimir temperaturas del mes. "
								+ "\n3 - Cambiar temperaturas de un día determinado. \n4 - Intercambiar datos de temperaturas. \n5 - Salir.");
						actionToChoose = teclado.nextInt();
					} while (actionToChoose < 1 || actionToChoose > 5);
					
					
						if (actionToChoose == 1) {
							
							System.out.print("Dias del mes: ");
							diasMes = teclado.nextInt();
							
							System.out.print("Limite superior de temperaturas máximas: ");
							temperaturasMaxMaxima = teclado.nextFloat();
							
							System.out.print("Limite inferior de temperaturas máximas: ");
							temperaturasMaxMinima = teclado.nextFloat();
							
							System.out.print("Limite superior de temperaturas mínimas: ");
							temperaturasMinMaxima = teclado.nextFloat();
							
							System.out.print("Limite inferior de temperaturas mínimas: ");
							temperaturasMinMinima = teclado.nextFloat();
							
							System.out.print("Nº Decimales (10 = 1 decimal, 100 = 2 decimales, etc): ");
							decimalFormat = teclado.nextInt();
							
							controlTemperaturas = new CControlTemperaturas(diasMes, temperaturasMaxMaxima, temperaturasMaxMinima,
									temperaturasMinMaxima, temperaturasMinMinima, decimalFormat);
							
							controlTemperaturas.setTemperaturas();
							
							System.out.println();
							
						}
						
						else if (actionToChoose == 2) {
							try {
								controlTemperaturas.printTemperaturas();
								System.out.println();
							}
							catch (NullPointerException e) {
								
									System.out.println("No existen temperaturas aún. ¿Tomar nuevo set de temperaturas? (1 = Si , 0 = No)");
							}
						}
						
						else if (actionToChoose == 3) {
							
							int diaAModificar;
							
							float newMaxTemp;
							
							float newMinTemp;
						
							System.out.print("Dia que se quiere modificar: ");
							diaAModificar = teclado.nextInt();
							
							System.out.print("Nueva temperatura máxima: ");
							newMaxTemp = teclado.nextFloat();
							
							System.out.print("Nueva temperatura mínima: ");
							newMinTemp = teclado.nextFloat();
							
							controlTemperaturas.cambiarTemperaturas(diaAModificar, newMaxTemp, newMinTemp);
							System.out.println();
						}
						
						else if (actionToChoose == 4) {
							
							int diaAIntercambiar1;
							
							int diaAIntercambiar2;
							
							System.out.print("Intercambiar dia ");
							diaAIntercambiar1 = teclado.nextInt();
							
							System.out.print("con dia ");
							diaAIntercambiar2 = teclado.nextInt();
							
							controlTemperaturas.intercambiarTemperaturas(diaAIntercambiar1, diaAIntercambiar2);
							System.out.println();
						}
						
				} while (actionToChoose != 5);
			} 
			
			else if (systemToChoose == 2) {
				
			} 
			
			else if (systemToChoose == 3) {
				
			}
			
		} while(systemToChoose != 4);
		
		
		
		
//		int diasMes = 30;
//		
//		float temperaturasMaxMaxima = 30;
//		
//		float temperaturasMaxMinima = 20;
//		
//		float temperaturasMinMaxima = 10;
//		
//		float temperaturasMinMinima = 0;
//		
//		int decimalFormat = 100;
//		
//		
//		CTemperaturas temperaturas = new CTemperaturas(diasMes, temperaturasMaxMaxima, temperaturasMaxMinima,
//				temperaturasMinMaxima, temperaturasMinMinima, decimalFormat);
//		
//		try {
//			temperaturas.printTemperaturas();
//		}
//		catch (NullPointerException e) {
//			System.out.println("No existen temperaturas aún. ¿Tomar nuevo set de temperaturas?");
//		}
//		
//		System.out.println();
//		
//		int diaAModificar = 30;
//		float newMaxTemp = 23.32f;
//		float newMinTemp = 6.2f;
//		
//		try {
//			temperaturas.cambiarTemperatura(diaAModificar, newMaxTemp, newMinTemp);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Dia fuera del rango permitido.");
//		}
//		catch(NullPointerException e) {
//			System.out.println("No existen temperaturas aún.");
//		}
//		
//		System.out.println();
//		
//		int diaAIntercambiar1 = 5;
//		int diaAIntercambiar2 = 7;
//		
//		try {
//			temperaturas.intercambiarTemperaturas(diaAIntercambiar1, diaAIntercambiar2);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Dia fuera del rango permitido.");
//		}
//		catch(NullPointerException e) {
//			System.out.println("No existen temperaturas aún.");
//		}
//		
//		System.out.println("FIN");
		
		
	}

}
