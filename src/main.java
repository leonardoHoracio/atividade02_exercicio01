
public class main {

	public static void main(String[] args) {

		int n = 10; //numero chumbado, tem que dar 55

		int sum = funcaoRecursiva(n); //chamada da fun��o e vari�vel para guardar o resultado da soma
		
		System.out.println(sum); 
	}

	private static int funcaoRecursiva(int n) {
		if (n <= 0) { //ponto de parada, se o usu�rio digitar negativo vai retornar ZERO.
			return 0;
		} else {
			return n + funcaoRecursiva(n-1); //Soma recursiva
		}
	}

}
