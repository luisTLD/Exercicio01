import java.util.*;

class SomarDoisNumeros {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int num1, num2, soma;
		 
		 // entrada do usuario
		 System.out.println("Digite um numero");
		 num1 = sc.nextInt();
		 System.out.println("Digite um numero");
		 num2 = sc.nextInt();
		 
		 // somar os 2 numeros
		 soma = num1 + num2;
		 
		 // printar no console
		 System.out.println("soma " + soma);
	
		 sc.close();
	}
	
	
}
