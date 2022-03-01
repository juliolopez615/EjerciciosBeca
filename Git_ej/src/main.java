
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un numero :)\n");
	int a = sc.nextInt();
	
	System.out.println("Introduce un numero :)\n");
	int b = sc.nextInt();
	
	System.out.println("La suma normal es: " + Suma.suma_normal(a, b));
	
	sc.close();
	
	}

}