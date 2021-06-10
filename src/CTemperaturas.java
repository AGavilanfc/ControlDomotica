
public class CTemperaturas {

	public CTemperaturas(int diasMes, float temperaturasMaxMaxima, float temperaturasMaxMinima, float temperaturasMinMaxima,
			float temperaturasMinMinima, int decimalFormat) {
		
			temperaturasMax = calcularTemperaturas(diasMes, temperaturasMaxMaxima, temperaturasMaxMinima, decimalFormat);
			temperaturasMin = calcularTemperaturas(diasMes, temperaturasMinMaxima, temperaturasMinMinima, decimalFormat);
			
			this.temperaturasMaxMaxima = temperaturasMaxMaxima;
			this.temperaturasMaxMinima = temperaturasMaxMinima;
			this.temperaturasMinMaxima = temperaturasMinMaxima;
			this.temperaturasMinMinima = temperaturasMinMinima;
	}
	
	float[] temperaturasMax;
	float[] temperaturasMin;
	float temperaturasMaxMaxima;
	float temperaturasMaxMinima;
	float temperaturasMinMaxima;
	float temperaturasMinMinima;
	
	public float[] calcularTemperaturas(int length, float maxAllowed, float minAllowed, int decimalFormat) {
		
		float[] temperaturas = new float[length];
		
		double numberToInsert;
		for (int i = 0; i < temperaturas.length; i++) {
			numberToInsert = (Math.random() * (maxAllowed - minAllowed) + minAllowed) * decimalFormat;
			temperaturas[i] = (float)Math.floor(numberToInsert) / decimalFormat;
		}
		return temperaturas;
	}
	
	public void printTemperaturas() throws NullPointerException {
			for (int i = 0; i < temperaturasMin.length; i++) {
				System.out.println("Dia " + (i + 1) + ": Temp max: " + temperaturasMax[i] + " Temp min: " + temperaturasMin[i]);
			}
	}
	
	public void cambiarTemperatura(int diaAModificar, float newMaxTemp, float newMinTemp) throws TempOutOfAllowedLimits {
		
			if (newMaxTemp > temperaturasMaxMaxima || newMaxTemp < temperaturasMaxMinima || newMinTemp > temperaturasMinMaxima || newMinTemp < temperaturasMinMinima) {
				throw new TempOutOfAllowedLimits("Temperatura fuera del rango permitido.");
			} 
			else {
				float oldMaxTemp = temperaturasMax[diaAModificar - 1];
				temperaturasMax[diaAModificar - 1] = newMaxTemp;
				
				float oldMinTemp = temperaturasMin[diaAModificar - 1];
				temperaturasMin[diaAModificar - 1] = newMinTemp;
				
				System.out.println("Dia " + diaAModificar + " modificado. Antiguos valores: [" + oldMinTemp + " - " + oldMaxTemp + "] Nuevos valores: ["
						+ temperaturasMin[diaAModificar - 1] + " - " + temperaturasMax[diaAModificar - 1] + "]");
			}
			
	}
	
	public void intercambiarTemperaturas(int day1, int day2) throws ArrayIndexOutOfBoundsException {
			float oldMaxTempDay1 = temperaturasMax[day1 - 1];
			float oldMinTempDay1 = temperaturasMin[day1 - 1];
			
			float oldMaxTempDay2 = temperaturasMax[day2 - 1];
			float oldMinTempDay2 = temperaturasMin[day2 - 1];
			
			temperaturasMax[day1 - 1] = oldMaxTempDay2;
			temperaturasMax[day2 - 1] = oldMaxTempDay1;
					
			temperaturasMin[day1 - 1] = oldMinTempDay2;
			temperaturasMin[day2 - 1] = oldMinTempDay1;
			
			System.out.println("Temperaturas del día " + day1 + " y el día " + day2 + " cambiadas.");
			System.out.println("Temperaturas actuales: Dia " + day1 + ": [" + temperaturasMin[day1 - 1] + " - " + temperaturasMax[day1 - 1] + "] Dia " + day2 + ": ["
					+ temperaturasMin[day2 - 1] + " - " + temperaturasMax[day2 - 1] + "]");
	}
}
