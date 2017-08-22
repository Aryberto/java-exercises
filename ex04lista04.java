import java.util.Scanner;

public class ex04lista04 {
	
	public static void main (String args[]) {
			
		Scanner read = new Scanner (System.in);
		
		int num, con = 1;
		
		System.out.print("Valor: ");
		num = read.nextInt();
			
		while (con<=num){
			System.out.println("" + con);
			con++;
		}
	}	
}

