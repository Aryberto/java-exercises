import java.util.Scanner;

class ex10lis03{

	public static void main (String[] args){

		double sf, vv, ve, total;

		Scanner read = new Scanner (System.in);

		System.out.print("Valor do Salario: ");
		sf = read.nextDouble();
		System.out.print("Valor das Vendas: ");
		vv = read.nextDouble();

		if (vv <= 1500){
			ve = vv * 0.03;
		}
		else 
			ve = vv * 0.05;

		total = sf + ve;

		System.out.printf("Salario total: %.2f", total);
	}
}