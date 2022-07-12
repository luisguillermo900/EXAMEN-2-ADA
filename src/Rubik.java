
public class Rubik {	

	public String resolver(String[] array1, String[] array2) {
		int tamanioArray1 = array1.length;	
		int tamanioArray2 = array2.length;
		int min = Math.min(tamanioArray1 , tamanioArray2);
		double contadorPositivo=0;
		double contadorNegativo=0;	
		for (int i = 0; i < min; i++) {
			if(array1[i].equals(array2[i])) {
				contadorPositivo++;
			}else {
				contadorNegativo++;	
			}
		}
		contadorNegativo = Math.max(tamanioArray1, tamanioArray2) - contadorPositivo;
		double total = contadorPositivo + contadorNegativo;
		double cociente = contadorPositivo / total;
		if(cociente > 0.4) {
			return "SUERTE";
		}else {
			return "NO";
		}

	}
}
