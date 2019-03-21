package operacoes;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n1, n2;
		double res;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro n�mero inteiro");
		n1 = input.nextInt();
		System.out.println("Insira o segundo n�mero inteiro");
		n2 = input.nextInt();
		
		Operacao operacao = new Operacao(n1, n2);

		operacao.soma();
		System.out.println("O resultado da soma �: "+ operacao.getResultado());
		
		operacao.calcularMedia(n1, n2);
		System.out.println("A m�dia dos n�meros �: "+ operacao.getResultado());
		
		res = operacao.multiplicar();
		System.out.println("O resultado da multiplica��o dos n�meros �: "+ res);

		res = operacao.dividir(n1, n2);
		System.out.println("O resultado da divis�o dos n�meros �: "+ res);	
		
		operacao.subtrair();
		System.out.println("O resultado da subtra��o �: "+ operacao.getResultado());
		
		res= operacao.calcularPotencia();
		System.out.println("O resultado da pot�ncia dos n�meros �: "+ res);
		
		
	}
}