
public class Resta {
private static int acumulador = 0;
	
	public static int resta_normal(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	public static int suma_acumulada(int numero) {
		acumulador-= numero;
		return acumulador;
	}

}
