import java.util.Locale;
import java.util.Scanner;

public class exercicio_2_estrutura_sequencial {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double raio = sc.nextDouble();
	double pi = 3.14159;
	double raio2;
	
	raio2 = Math.pow(raio, 2);
	
	double area = pi * raio2;
	
	System.out.printf("A �rea desse c�rculo �: %.4f", area);
	
	sc.close();

	}

}
