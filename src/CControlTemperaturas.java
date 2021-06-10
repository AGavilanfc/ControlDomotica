
public class CControlTemperaturas {
	
	public CControlTemperaturas(int diasMes, float temperaturasMaxMaxima, float temperaturasMaxMinima, float temperaturasMinMaxima,
			float temperaturasMinMinima, int decimalFormat) {
		
		this.diasMes = diasMes;
		this.temperaturasMaxMaxima = temperaturasMaxMaxima;
		this.temperaturasMaxMinima = temperaturasMaxMinima;
		this.temperaturasMinMaxima = temperaturasMinMaxima;
		this.temperaturasMinMinima = temperaturasMinMinima;
		this.decimalFormat = decimalFormat;
	}
	
	int diasMes;
	
	float temperaturasMaxMaxima;
	
	float temperaturasMaxMinima;
	
	float temperaturasMinMaxima;
	
	float temperaturasMinMinima;
	
	int decimalFormat;
	
	CTemperaturas temperaturas;
	
	public void setTemperaturas() {
		temperaturas = new CTemperaturas(diasMes, temperaturasMaxMaxima, temperaturasMaxMinima,
				temperaturasMinMaxima, temperaturasMinMinima, decimalFormat);
	}
	
	public void printTemperaturas() {
			temperaturas.printTemperaturas();
			System.out.println();
		
	}
	
	public void cambiarTemperaturas(int diaAModificar, float newMaxTemp, float newMinTemp) {
		try {
			temperaturas.cambiarTemperatura(diaAModificar, newMaxTemp, newMinTemp);
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Dia fuera del rango permitido.");
		}
		catch(NullPointerException e) {
			System.out.println("No existen temperaturas aún.");
		}
		catch(TempOutOfAllowedLimits e) {
			System.out.println("Temperaturas fuera del rango Permitido");
		}
	}
	
	public void intercambiarTemperaturas(int diaAIntercambiar1, int diaAIntercambiar2) {
		
		try {
			temperaturas.intercambiarTemperaturas(diaAIntercambiar1, diaAIntercambiar2);
			System.out.println();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dia fuera del rango permitido.");
		}
		catch(NullPointerException e) {
			System.out.println("No existen temperaturas aún.");
		}
	}
}
