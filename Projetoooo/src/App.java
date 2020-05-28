
public class App { 

	/**
	 * Essa aplicação serve meramente para .... não sei....
	 * 
	 * @author Irina Fernandes
	 * @version 1.0
	 * @since 27/05/20
	 */


	/**
	 * Esse método é usado para calcular a soma de dois números
	 * @param valor1 primeiro parâmetro
	 * @param valor2 segundo parâmetro
	 * @return retorna o resultado da soma de valor1 e valor2
	 */

	public int somar (int valor1, int valor2) {
		return valor1 + valor2;
	}


	/**
	 * Esse método é usado para calcular a diferença entre dois números decimais ou inteiros
	 * @param valor1 primeiro parâmetro
	 * @param valor2 segundo parâmetro
	 * @return retorna o resultado da diferença entre valor1 e valor2
	 */
	public double subtrair (double valor1, double valor2) {
		return valor1-valor2;
	}


	/**
	 * Este método é usado para calcular o produto de dois números inteiros
	 * @param valor1 primeiro parâmetro
	 * @param valor2 segundo parâmetro
	 * @return retorna  a multiplicação de valor1 e valor2
	 */
	public int multiplicar (int valor1, int valor2) {
		return valor1*valor2;
	}


	/**
	 * Esse método é usado para saber se a Irina é linda hehe
	 * @param nome primeiro argumento
	 * @return retorna true se o nome dado como argumento for Irina e false caso contrário
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
