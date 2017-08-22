import java.util.Scanner;

public class ex05lista04 {
	
	public static void main (String args[]) {
			
		Scanner read = new Scanner (System.in);
		
		int num, con = 1;
		
		do {
			System.out.print("Valor: ");
			num = read.nextInt();
		} while (num<=0);
			
		while (con<=num){
			System.out.println("" + con);
			con++;
		}
	}	
}
