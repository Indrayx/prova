package prova1;
import java.util.Locale;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
 
		
		int compras,atraso,pay,scoreatraso,scorecompras;
		double ticket,totalcompras, scoretotal;
		char pagamento;
		pay = 0;
		scoreatraso = 0;
		scorecompras = 0;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("-----------------------------");
		System.out.println("INFORME OS DADOS DO ULTIMO ANO");
		
		System.out.println("Quantas compras o cliente fez no ultimo ano?");
		compras = sc.nextInt();
		System.out.println("Qual o ticket medio?");
			
		ticket = sc.nextDouble();
		
		 
		totalcompras = ticket * compras;
		
		
		if (compras == 0) { scorecompras = 0;}	
		else if(totalcompras > 0 && totalcompras <= 3000 && compras < 2) {scorecompras = 20;}
		else if (totalcompras > 0 && totalcompras <= 3000 && compras >= 2) { scorecompras = 40;}
		else if(totalcompras > 3000 ) {scorecompras = 60;}
		
		System.out.printf("%n%n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
