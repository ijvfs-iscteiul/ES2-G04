
public class App { 

	/**
	 * Essa aplica��o serve meramente para .... n�o sei....
	 * 
	 * @author Irina Fernandes
	 * @version 1.0
	 * @since 27/05/20
	 */


	/**
	 * Esse m�todo � usado para calcular a soma de dois n�meros
	 * @param valor1 primeiro par�metro
	 * @param valor2 segundo par�metro
	 * @return retorna o resultado da soma de valor1 e valor2
	 */

	public int somar (int valor1, int valor2) {
		return valor1 + valor2;
	}


	/**
	 * Esse m�todo � usado para calcular a diferen�a entre dois n�meros decimais ou inteiros
	 * @param valor1 primeiro par�metro
	 * @param valor2 segundo par�metro
	 * @return retorna o resultado da diferen�a entre valor1 e valor2
	 */
	public double subtrair (double valor1, double valor2) {
		return valor1-valor2;
	}


	/**
	 * Este m�todo � usado para calcular o produto de dois n�meros inteiros
	 * @param valor1 primeiro par�metro
	 * @param valor2 segundo par�metro
	 * @return retorna  a multiplica��o de valor1 e valor2
	 */
	public int multiplicar (int valor1, int valor2) {
		return valor1*valor2;
	}


	/**
	 * Esse m�todo � usado para saber se a Irina � linda hehe
	 * @param nome primeiro argumento
	 * @return retorna true se o nome dado como argumento for Irina e false caso contr�rio
	 */
	public boolean Linda (String nome) { 
		if(nome.equals("Irina"))
			return true;
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		App app = new App();
		int valor = app.somar(1, 2);
	}


}
