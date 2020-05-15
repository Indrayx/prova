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
		System.out.println("Quantas vezes o cliente  atrasou o pagamento?");
		atraso = sc.nextInt();
		
		if (atraso == 0) { scoreatraso = 30;}
		else if (atraso == 1) { scoreatraso = 15;}
		else if (atraso > 1) { scoreatraso = 0;}
		
					
		System.out.println("A maioria das compras foi em dinheiro, cartão ou boleto (D/C/B)");
		pagamento = (sc.next().charAt(0));
		
		
		if (pagamento == 'd') { pay = 5;}
		else if (pagamento == 'c' || pagamento == 'b')  { pay = 10;}
		
		
		
		
		scoretotal = scorecompras + scoreatraso + pay;
		
		System.out.println("Score de volume de compras = " + totalcompras + " pontos");
		System.out.println("Score de inadimplência = " + atraso + " pontos");
		System.out.println("Score de forma de pagamento = " + pay);
		
		if(scoretotal > 0 && scoretotal <= 25 ) { 
			System.out.println("CLIENTE BRONZE");
		}
		else if (scoretotal > 25 && scoretotal <= 75 ) {
			System.out.println("CLIENTE PRATA");
			}
		else if (scoretotal > 75) {
			System.out.println("CLIENTE OURO");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
