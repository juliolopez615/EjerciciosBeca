//Clase principal
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un numero :)\n");
	int a = sc.nextInt();
	
	System.out.println("Introduce un numero :)\n");
	int b = sc.nextInt();
	
	System.out.println("La suma normal es: " + Suma.suma_normal(a, b));
	
	while(true) {
		System.out.println("Introduce un numero :)\n");
		int c = sc.nextInt();
		
		System.out.println("La suma acumulada es: " + Resta.resta_acumulada(c));
		System.out.println("Quiere salir? s/n :)\n");
		
		char op = sc.next().charAt(0);
		
		if(op == 's' || op == 'S') break;
		
	}
	
	while(true) {
		System.out.println("Introduce un numero :)\n");
		int c = sc.nextInt();
		
		System.out.println("La suma acumulada es: " + Suma.suma_acumulada(c));
		System.out.println("Quiere salir? s/n :)\n");
		
		char op = sc.next().charAt(0);
		
		if(op == 's' || op == 'S') break;
		
	}
	
	sc.close();
	
	}

}