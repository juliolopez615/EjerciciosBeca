// Clase resta
public class Resta {
private static int acumulador = 0;
	
	//metodo que resta normal
	public static int resta_normal(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	//metodo que resta acumulado
	public static int resta_acumulada(int numero) {
		acumulador-= numero;
		return acumulador;
	}

}
