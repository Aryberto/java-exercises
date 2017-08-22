import java.util.Scanner;

public class anaHelenaCarro {
	
	public static void main(String[] args){

	Scanner leia = new Scanner (System.in);

	double ve=0, vg=0, res;

	System.out.print("Valor da gasosa: ");
	vg = leia.nextDouble();
	System.out.print("Valor do alcool: ");
	ve = leia.nextDouble();

	res = ve/vg;

	if (res >= 0.7){
		System.out.print("\nColoque Gasosa!!\n\n");
	}

	else
		System.out.print("\nColoque Alcool!!\n\n"); 
	}
}
